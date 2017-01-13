SUMMARY = "Custom configuration for Lighttpd server"
AUTHOR = "Laurent TRABATTONI <laurent.trabattoni@renault.com>"
LICENSE = "Renault"
LIC_FILES_CHKSUM = "file://License.txt;md5=110fbaa162c6dd68f7e9ce4faab63e03"

SRC_URI = "git://zircon.tcr.renault.fr/CodeObjects/lighttpd-config.git;protocol=ssh;user=git"
SRC_URI += "file://Renault"
SRCREV = "${AUTOREV}"
PV = "${SRCPV}"


S = "${WORKDIR}/git"

PACKAGES = "${PN}"
FILES_${PN} = "${bindir}/* " 


