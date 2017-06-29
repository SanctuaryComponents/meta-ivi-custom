SUMMARY = "Cortana libraries for communicating with Cortana"
AUTHOR = "Microsoft"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://readme.md;md5=9dc4e39e9e20262223447bd095816a2e"
SRC_URI = "gitsm://cortanasdk-renault.visualstudio.com/_git/CortanaSDK;protocol=https;user=renaultaccess:Cortana-Pass"
SRCREV = "${AUTOREV}"
PV = "${SRCPV}"

DEPENDS = " curl "
inherit cmake gettext

EXTRA_OECMAKE = " -DIOT_CORTANA_NO_CDP=1 -DDISABLE_KEYWORD_SPOTTER=1 "

S = "${WORKDIR}/git"

PACKAGES = "${PN}"
FILES_${PN} = "${bindir}/* " 


