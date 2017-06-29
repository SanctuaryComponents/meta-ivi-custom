TEMPLATE     = lib
TARGET       = qtlayerman

QT					+= widgets

INCLUDEPATH += $$[QT_SYSROOT]/usr/include/ilm \
							 $$[QT_SYSROOT]/usr/include/layermanager

LIBS        += -lilmClient

SOURCES      = qlayermanapplication.cpp
HEADERS      = qlayermanapplication.h

headers.files = $$HEADERS
isEmpty(INSTALLPREFIX) {
    headers.path = $$[QT_INSTALL_HEADERS]
    target.path = $$[QT_INSTALL_LIBS]
} else {
    headers.path = $$INSTALLPREFIX/include/
    target.path = $$INSTALLPREFIX/lib/
}
INSTALLS += headers
INSTALLS += target

