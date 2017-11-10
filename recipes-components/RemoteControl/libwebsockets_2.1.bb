# Adapted by RENAULT (X.JAFFREZIC) from MIT based recipes 

DESCRIPTION = "lightweight C websockets library"
SECTION = "libs"
LICENSE = "LGPL2.1"
LIC_FILES_CHKSUM = "file://LICENSE;md5=e3393a657830d4a118c5a6ed35ba53d0"
SRC_URI = "git://github.com/warmcat/libwebsockets.git;tag=v2.1.0"

S = "${WORKDIR}/git"

DEPENDS += "zlib openssl"

inherit cmake pkgconfig

PACKAGES += "${PN}-test"
FILES_${PN}-dev += "${libdir}/cmake"
FILES_${PN}-test += "${datadir}/"

