DESCRIPTION = "Test Program" 
LICENSE = "MIT" 
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"

SRC_URI = "file://test-program.c"
           
S = "${WORKDIR}/build" 

do_compile() { 
    ${CC} ${CFLAGS} ${LDFLAGS} ${WORKDIR}/test-program.c -o ${S}/test-program
} 

do_install() { 
    install -d ${D}${bindir} # Create DIR in usr bin
    install -m 0755 ${S}/test-program ${D}${bindir} # move bin 
} 
