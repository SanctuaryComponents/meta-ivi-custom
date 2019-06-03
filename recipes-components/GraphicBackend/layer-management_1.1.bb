DESCRIPTION = "LayerManager"
HOMEPAGE = "https://www.genivi.org/"
SECTION = "environment/base"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=071e6b9a5eb9fc5868edf57ce153e5b9"

DEPENDS = "virtual/egl dbus libxkbcommon libffi"

SRCREV = "5e2f490b40b8b60a0efbd2b244be44d93bc081f6"
PR = "r1"

SRC_URI = " \
    git://github.com/SancturaryComponents/layer_management.git;protocol=git \
    file://layermanager.service \
    "

S = "${WORKDIR}/git"

inherit gettext cmake systemd

# Needed this for imx6 boards to use precompiled EGL libraries
python () {
    if ((d.getVar("MACHINE", True) or "").find("imx6") != -1):
	flags = d.getVar("OECMAKE_CXX_FLAGS", True)
	flags += " -DLINUX -DEGL_API_FB"
	d.setVar('OECMAKE_CXX_FLAGS', flags)
}

SYSTEMD_PACKAGES = "${PN}"
SYSTEMD_SERVICE_${PN} = "layermanager.service"
SYSTEMD_AUTO_ENABLE = "disable"

EXTRA_OECMAKE += " -DWITH_EXAMPLE_SCENE_PROVIDER=ON -DWITH_WL_EXAMPLE=OFF -DWITH_X11_GLES=OFF -DWITH_EGL_EXAMPLE=OFF "

FILES_${PN} += " \
    ${libdir}/lib* \
    ${libdir}/layermanager/lib* \
    ${libdir}/layermanager/communicator/lib* \
    ${libdir}/layermanager/ipcmodules/lib* \
    ${libdir}/layermanager/renderer/lib* \
    ${libdir}/layermanager/renderer/renderer* \
    ${libdir}/layermanager/sceneprovider/* \
    ${systemd_unitdir}/system/layermanager.service \
    "

FILES_${PN}-dev = " \
    ${includedir}/* \
    "
FILES_${PN}-staticdev += " \
    ${libdir}/layermanager/static/lib* \
    "
FILES_${PN}-dbg += " \
    ${libdir}/layermanager/.debug/ \
    ${libdir}/layermanager/communicator/.debug/ \
    ${libdir}/layermanager/ipcmodules/.debug/ \
    ${libdir}/layermanager/renderer/.debug/ \
    ${libdir}/layermanager/sceneprovider/.debug/ \
    "

do_install_append() {
    if ${@bb.utils.contains('DISTRO_FEATURES','systemd','true','false',d)}; then
        install -d ${D}${systemd_unitdir}/system/
        install -m 0644 ${WORKDIR}/layermanager.service ${D}${systemd_unitdir}/system
    fi
}
