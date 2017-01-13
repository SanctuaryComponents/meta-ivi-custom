SUMMARY = "Remote CPU monitoring with web interface"
AUTHOR = "davidsblog https://github.com/davidsblog/rCPU"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=c47df75286bfb1e412fa8e24012f6a7d"

SRC_URI = "git://zircon.tcr.renault.fr/CodeObjects/rCPU.git;branch=Dev;protocol=ssh;user=git"
SRCREV = "${AUTOREV}"
PV = "${SRCPV}"

inherit cmake

DEPENDS = " eglibc"

S = "${WORKDIR}/git"

PACKAGES = "${PN}"
FILES_${PN} = "${bindir}/* " 


