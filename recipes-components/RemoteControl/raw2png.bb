SUMMARY = "RAW to PNG file converter for BOSCH plateform "
AUTHOR = "François CARON <francois.caron@renault.com>"
LICENSE = "Renault"
LIC_FILES_CHKSUM = "file://License.txt;md5=110fbaa162c6dd68f7e9ce4faab63e03"

SRC_URI = "git://zircon.tcr.renault.fr/CodeObjects/RawToPngConverter.git;protocol=ssh;user=git"
SRCREV = "${AUTOREV}"
PV = "${SRCPV}"

inherit cmake

DEPENDS = " libpng glibc openssl"

S = "${WORKDIR}/git"

FILES_${PN} = "${bindir}/* " 

FILES_${PN}-dbg += "${bindir}/.debug "