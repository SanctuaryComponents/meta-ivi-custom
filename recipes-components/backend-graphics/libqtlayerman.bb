# Adapted by RENAULT (X.JAFFREZIC) 

DESCRIPTION = "Abtraction library from QT to Layer Manager"
SECTION = "libs"
LICENSE = "LGPL2.1"
LIC_FILES_CHKSUM = "file://README;md5=387211951ec456638c5291358d406d36"
SRC_URI = " \
			file://qlayermanapplication.h \
			file://qlayermanapplication.cpp \
			file://libqlayerman.pro \
			file://README \
"

S = "${WORKDIR}"

DEPENDS += "layer-management qtbase qtquick1"

inherit qmake5 pkgconfig


