SUMMARY = "Remote control POC over some/IP"
AUTHOR = "Thibault Chatelain (Stagiaire 2016)"
LICENSE = "Renault"
LIC_FILES_CHKSUM = "file://LICENSE;md5=110fbaa162c6dd68f7e9ce4faab63e03"

SRC_URI = "git://zircon.tcr.renault.fr/Projects/SomeIP/VideoStreamControl.git;branch=refactor;protocol=ssh;user=git"
SRCREV = "${AUTOREV}"
PV = "${SRCPV}"

inherit cmake

DEPENDS = " boost vsomeip video-samples "

S = "${WORKDIR}/git"

PACKAGES = "${PN}"
FILES_${PN} = "${bindir}/* " 


