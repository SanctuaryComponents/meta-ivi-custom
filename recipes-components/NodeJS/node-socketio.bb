SUMMARY = "Node JS Plugin to access DBus"
SECTION = "libs"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://LICENSE;md5=4ba099e0b43af5af03d887ec8395b604"
SRC_URI = "git://github.com/socketio/socket.io.git;tag=master"

S = "${WORKDIR}/git"

DEPENDS += " nodejs  glib-2.0 dbus "
RDEPENDS_${PN} += " nodejs "

inherit npm-base pkgconfig

do_compile() {
    # changing the home directory to the working directory, the .npmrc will be created in this directory
    export HOME=${WORKDIR}
		export HTTP_PROXY=http://zircon.tcr.renault.fr:3128
		export HTTPS_PROXY=http://zircon.tcr.renault.fr:3128

    # configure cache to be in working directory
    npm set cache ${WORKDIR}/npm_cache

    # clear local cache prior to each compile
    npm cache clear

    # compile and install node modules in source directory
    npm --arch=${TARGET_ARCH} --verbose install
}

do_install() {	
    install -d ${D}${libdir}/node_modules
    install -d ${D}${libdir}/node_modules/socketio
    install -d ${D}${libdir}/node_modules/socketio/build/Release/
    install -d ${D}${libdir}/node_modules/node-dbus/test
    install -m 0664 ${S}/test/test-method-call.js ${D}${libdir}/node_modules/node-dbus/test/
    install -m 0664 ${S}/test/test-signal-listener.js ${D}${libdir}/node_modules/node-dbus/test/
    install -m 0664 ${S}/test/test-signal-send.js ${D}${libdir}/node_modules/node-dbus/test/
    install -m 0664 ${S}/package.json ${D}${libdir}/node_modules/socketio/
    install -m 0664 ${S}/dbus.js ${D}${libdir}/node_modules/sockeio/
    install -m 0664 ${S}/build/Release/ndbus.node ${D}${libdir}/node_modules/node-dbus/build/Release/
}


FILES_${PN} += " \
				${libdir}/node_modules \
        ${libdir}/node_modules/socketio \
        ${libdir}/node_modules/node-dbus/build/Release/ \
"

FILES_${PN}-dbg += " \
				${libdir}/node_modules/.debug \
        ${libdir}/node_modules/socketio/.debug \
        ${libdir}/node_modules/socketio/build/build/Release/.debug \
"
