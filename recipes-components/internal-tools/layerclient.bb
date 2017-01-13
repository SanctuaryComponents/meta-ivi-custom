SUMMARY = "Simple LayerManagement that show a bit a graphics "
AUTHOR = "Xavier JAFFREZIC <xavier.jaffrezic@renault.com"
LICENSE = "Renault"
LIC_FILES_CHKSUM = "file://License.txt;md5=110fbaa162c6dd68f7e9ce4faab63e03"

SRC_URI = "git://zircon.tcr.renault.fr/CodeObjects/LayerClientDemo.git;protocol=ssh;user=git"
SRCREV = "${AUTOREV}"
PV = "${SRCPV}"

DEPENDS = "layer-management eglibc "

S = "${WORKDIR}/git"
PACKAGES = "${PN}"
FILES_${PN} = "${bindir}/* " 

inherit pkgconfig cmake


