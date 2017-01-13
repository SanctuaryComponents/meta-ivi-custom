SUMMARY = "DBus Load testing utilities"
AUTHOR = "Renault internal tools"
LICENSE = "Renault"
LIC_FILES_CHKSUM = "file://LICENSE;md5=110fbaa162c6dd68f7e9ce4faab63e03"

SRC_URI = "git://zircon.tcr.renault.fr/CodeObjects/DBusLoadTest.git;protocol=ssh;user=git"
SRCREV = "${AUTOREV}"
PV = "${SRCPV}"

inherit cmake

DEPENDS = " dbus"

S = "${WORKDIR}/git"

PACKAGES = "${PN}"
FILES_${PN} = "${bindir}/* " 


