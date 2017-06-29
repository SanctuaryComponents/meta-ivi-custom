/***************************************************************************
**
** This file is part of libqtlayerman example **
**
** Copyright (c) 2011 Nokia Corporation and/or its subsidiary(-ies).*
**
** All rights reserved.
** Contact:  Nokia Corporation (qt-info@nokia.com)
**
** You may use this file under the terms of the BSD license as follows:
**
** "Redistribution and use in source and binary forms, with or without
** modification, are permitted provided that the following conditions are met:
**
**  * Redistributions of source code must retain the above copyright notice,
**    this list of conditions and the following disclaimer.
**  * Redistributions in binary form must reproduce the above copyright notice,
**    this list of conditions and the following disclaimer in the documentation
**    and/or other materials provided with ** the distribution.
**  * Neither the name of Nokia Corporation and its Subsidiary(-ies) nor the
**    names of its contributors may be used to endorse or promote products
**    derived from this software without specific ** prior written permission.
**
** THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS"
** AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE
** IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE
** ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS BE
** LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL
** DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR
** SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER
** CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY,
** OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE
** OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE."
**
**************************************************************************/

#include <QApplication>
//#include <QtOpenGL>
//#include <QtDeclarative/QDeclarativeView>
#include <QPushButton>


//#include "qlayermanapplication.h"
#include <iostream>


int main(int argc, char *argv[])
{
//    QLayerManApplication a(argc, argv);
    QApplication a(argc, argv);
//    QDeclarativeView w(QUrl("planes.qml"));
//    QDeclarativeView w;
    QPushButton b("Hello world!");
//		std::cout << " Constructor Done" << std::endl << std::flush;
//    w.setViewport(new QGLWidget());
//    w.setViewport(new QWidget());
//		std::cout << " SetViewport Done" << std::endl << std::flush;
//    a.registerWindow(&b);
//    a.registerWindow(&w);
//		std::cout << " Registering Done" << std::endl << std::flush;
//    w.move(200,300);
//    w.show();

		b.setGeometry(200, 300, 200, 300);
    b.show();

		std::cout << " Show requested" << std::endl << std::flush;
    return a.exec();
}

