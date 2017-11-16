# Adapted by RENAULT (X.JAFFREZIC) from MIT based recipes 

DESCRIPTION = "lightweight C websockets library"
SECTION = "libs"
LICENSE = "LGPL2.1"
LIC_FILES_CHKSUM = "file://LICENSE;md5=041a1dec49ec8a22e7f101350fd19550"
SRC_URI = "git://github.com/warmcat/libwebsockets.git;branch=v1.6-stable;tag=v1.6.2"


S = "${WORKDIR}/git"

DEPENDS += "zlib openssl"

inherit cmake pkgconfig

PACKAGES += "${PN}-test"
FILES_${PN}-dev += "${libdir}/cmake"
FILES_${PN}-test += "${datadir}/"

