# Adapted by RENAULT (X.JAFFREZIC) 

DESCRIPTION = "QML demo using the LibQtLayerMan library"
SECTION = "test"
LICENSE = "LGPL2.1"
LIC_FILES_CHKSUM = "file://README;md5=387211951ec456638c5291358d406d36"
SRC_URI = " \
			file://main.cpp \
			file://planes.qml \
			file://qlayerdemo.pro \
			file://README \
"

S = "${WORKDIR}"

#DEPENDS += "layer-management libqtlayerman qtbase qtquick1 "
#DEPENDS += "layer-management libqtlayerman qtbase "
DEPENDS += " qtbase "

do_install_append() {

rm -rf ${D}${prefix}/src 

}

FILES_${PN}-dbg = "${datadir}/examples/.debug"
FILES_${PN} = "${datadir}/examples"
PACKAGES = " ${PN}-dbg ${PN} "

inherit qmake5 pkgconfig
