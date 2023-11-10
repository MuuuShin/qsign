package moe.fuqiuluo.unidbg.env.files

fun fetchCpuInfo(): ByteArray {
    return """
        processor	: 0
        BogoMIPS	: 38.40
        Features	: fp asimd evtstrm aes pmull sha1 sha2 crc32 atomics fphp asimdhp cpuid asimdrdm lrcpc dcpop asimddp
        CPU implementer	: 0x41
        CPU architecture: 8
        CPU variant	: 0x2
        CPU part	: 0xd05
        CPU revision	: 0

        processor	: 1
        BogoMIPS	: 38.40
        Features	: fp asimd evtstrm aes pmull sha1 sha2 crc32 atomics fphp asimdhp cpuid asimdrdm lrcpc dcpop asimddp
        CPU implementer	: 0x41
        CPU architecture: 8
        CPU variant	: 0x2
        CPU part	: 0xd05
        CPU revision	: 0

        processor	: 2
        BogoMIPS	: 38.40
        Features	: fp asimd evtstrm aes pmull sha1 sha2 crc32 atomics fphp asimdhp cpuid asimdrdm lrcpc dcpop asimddp
        CPU implementer	: 0x41
        CPU architecture: 8
        CPU variant	: 0x2
        CPU part	: 0xd05
        CPU revision	: 0

        processor	: 3
        BogoMIPS	: 38.40
        Features	: fp asimd evtstrm aes pmull sha1 sha2 crc32 atomics fphp asimdhp cpuid asimdrdm lrcpc dcpop asimddp
        CPU implementer	: 0x41
        CPU architecture: 8
        CPU variant	: 0x2
        CPU part	: 0xd05
        CPU revision	: 0

        processor	: 4
        BogoMIPS	: 38.40
        Features	: fp asimd evtstrm aes pmull sha1 sha2 crc32 atomics fphp asimdhp cpuid asimdrdm lrcpc dcpop asimddp
        CPU implementer	: 0x41
        CPU architecture: 8
        CPU variant	: 0x2
        CPU part	: 0xd05
        CPU revision	: 0

        processor	: 5
        BogoMIPS	: 38.40
        Features	: fp asimd evtstrm aes pmull sha1 sha2 crc32 atomics fphp asimdhp cpuid asimdrdm lrcpc dcpop asimddp
        CPU implementer	: 0x41
        CPU architecture: 8
        CPU variant	: 0x2
        CPU part	: 0xd05
        CPU revision	: 0

        processor	: 6
        BogoMIPS	: 38.40
        Features	: fp asimd evtstrm aes pmull sha1 sha2 crc32 atomics fphp asimdhp cpuid asimdrdm lrcpc dcpop asimddp
        CPU implementer	: 0x41
        CPU architecture: 8
        CPU variant	: 0x1
        CPU part	: 0xd41
        CPU revision	: 1

        processor	: 7
        BogoMIPS	: 38.40
        Features	: fp asimd evtstrm aes pmull sha1 sha2 crc32 atomics fphp asimdhp cpuid asimdrdm lrcpc dcpop asimddp
        CPU implementer	: 0x41
        CPU architecture: 8
        CPU variant	: 0x1
        CPU part	: 0xd41
        CPU revision	: 1
        
    """.trimIndent().toByteArray()
}