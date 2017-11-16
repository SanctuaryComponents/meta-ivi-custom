SUMMARY = "Open source MQTT v3.1 implemention"
DESCRIPTION = "Mosquitto is an open source (BSD licensed) message broker that implements the MQ Telemetry Transport protocol version 3.1. MQTT provides a lightweight method of carrying out messaging using a publish/subscribe model. "
HOMEPAGE = "http://mosquitto.org/"
SECTION = "console/network"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=62ddc846179e908dc0c8efec4a42ef20"

DEPENDS = "openssl util-linux python libwebsockets"

PR = "r0"

SRC_URI = "http://mosquitto.org/files/source/mosquitto-${PV}.tar.gz \
           file://ares-websocket.patch \
           file://prefix.patch \
           file://mosquitto.service \
"

SRC_URI[md5sum] = "4cb978502312bff2dcdaab6a433b1bf2"
SRC_URI[sha256sum] = "71a1cb37893403e00b7db85c5db4af50b40d055ce61e5d21092c2594f2023b8b"

inherit cmake

EXTRA_OECMAKE += " -DWITH_WEBSOCKETS:BOOL=ON "


S = "${WORKDIR}/${PN}-${PV}"

do_compile() {
	cd ${S}
	oe_runmake
}

do_install() {
	cd ${S}
	mkdir -p ${D}${bindir}
	mkdir -p ${D}${sbindir}
	mkdir -p ${D}${libdir}
	mkdir -p ${D}${sysconfdir}
	oe_runmake install DESTDIR=${D}
}

FILES_${PN} = "${bindir} ${sbindir} ${libdir}  ${sysconfdir}"

INSANE_SKIP_${PN} = "already-stripped"

