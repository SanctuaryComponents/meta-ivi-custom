SUMMARY = "Meta package for generating a BOSCH compatible SDK"
LICENSE = "MIT"

LIC_FILES_CHKSUM = "file://${COREBASE}/LICENSE;md5=4d92cd373abda3937c2bc47fbc49d690 \
                    file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"

inherit populate_sdk populate_sdk_qt5 

RDEPENDS_${PN} += " layer-management "

TOOLCHAIN_TARGET_TASK += " layer-management "
