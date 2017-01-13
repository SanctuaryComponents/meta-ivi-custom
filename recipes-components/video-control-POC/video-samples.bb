SUMMARY = "Video samples for SomeIP demo"
AUTHOR = "Thibault CHATILLON (Stagiaire 2016)"

LICENSE = ""
SRC_URI = "http://zircon.tcr.renault.fr/SourcesPackages/SomeIP.Samples.tar.gz;name=downloaded"
SRC_URI[downloaded.md5sum] = "7165eb380d0bfa04cae9028cf4708c5b"
SRC_URI[downloaded.sha256sum] = "eaa8a649862ee2551ff1277bc7798977e8d68896a60850f08fd52af9f7fa0b8f"
LIC_FILES_CHKSUM = "file://Copyrights;md5=f9856d5eb45179136f3f51db0a45932c"

PV = "1.0"

S = "${WORKDIR}/Samples"

do_install() {
       install -d ${D}${datadir}/SomeIP
       install -m 0644 ${S}/* ${D}${datadir}/SomeIP/
}

PACKAGES = " ${PN}"
FILES_${PN} = "${datadir}/SomeIP/" 

