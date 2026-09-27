package kotlin.text;

import defpackage.gkj;
import defpackage.hkj;
import defpackage.ozm;
import defpackage.vsj;
import kotlin.UByte;
import kotlin.UInt;
import okhttp3.internal.http2.Settings;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public abstract class i {
    public static final String a(long j) {
        return ozm.i(CharsKt__CharJVMKt.checkRadix(16), j);
    }

    public static final String b(int i) {
        return ozm.i(CharsKt__CharJVMKt.checkRadix(16), i & 4294967295L);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final byte c(String str) {
        UByte uByte;
        str.getClass();
        UInt f = f(10, str);
        if (f != null) {
            int i = f.a;
            if (Integer.compareUnsigned(i, UInt.m886constructorimpl(255)) <= 0) {
                uByte = UByte.m884boximpl(UByte.m885constructorimpl((byte) i));
                if (uByte == null) {
                    return uByte.a;
                }
                StringsKt__StringNumberConversionsKt.i(str);
                throw null;
            }
        }
        uByte = null;
        if (uByte == null) {
        }
    }

    public static final int d(String str) {
        str.getClass();
        UInt f = f(10, str);
        if (f != null) {
            return f.a;
        }
        StringsKt__StringNumberConversionsKt.i(str);
        throw null;
    }

    public static final int e(String str) {
        UInt f = f(16, str);
        if (f != null) {
            return f.a;
        }
        StringsKt__StringNumberConversionsKt.i(str);
        throw null;
    }

    public static final UInt f(int i, String str) {
        int i2;
        str.getClass();
        CharsKt__CharJVMKt.checkRadix(i);
        int length = str.length();
        if (length != 0) {
            int i3 = 0;
            char charAt = str.charAt(0);
            if (charAt < '0') {
                i2 = 1;
                if (length == 1 || charAt != '+') {
                    return null;
                }
            } else {
                i2 = 0;
            }
            int m886constructorimpl = UInt.m886constructorimpl(i);
            int i4 = 119304647;
            while (i2 < length) {
                int digit = Character.digit((int) str.charAt(i2), i);
                if (digit >= 0) {
                    if (Integer.compareUnsigned(i3, i4) > 0) {
                        if (i4 == 119304647) {
                            i4 = Integer.divideUnsigned(-1, m886constructorimpl);
                            if (Integer.compareUnsigned(i3, i4) > 0) {
                                return null;
                            }
                        } else {
                            return null;
                        }
                    }
                    int m886constructorimpl2 = UInt.m886constructorimpl(i3 * m886constructorimpl);
                    int m886constructorimpl3 = UInt.m886constructorimpl(UInt.m886constructorimpl(digit) + m886constructorimpl2);
                    if (Integer.compareUnsigned(m886constructorimpl3, m886constructorimpl2) < 0) {
                        return null;
                    }
                    i2++;
                    i3 = m886constructorimpl3;
                } else {
                    return null;
                }
            }
            return new UInt(i3);
        }
        return null;
    }

    public static final long g(String str) {
        str.getClass();
        hkj h = h(str);
        if (h != null) {
            return h.a;
        }
        StringsKt__StringNumberConversionsKt.i(str);
        throw null;
    }

    public static final hkj h(String str) {
        str.getClass();
        str.getClass();
        CharsKt__CharJVMKt.checkRadix(10);
        int length = str.length();
        if (length != 0) {
            int i = 0;
            char charAt = str.charAt(0);
            if (charAt < '0') {
                i = 1;
                if (length == 1 || charAt != '+') {
                    return null;
                }
            }
            gkj gkjVar = hkj.b;
            long j = 0;
            long j2 = 512409557603043100L;
            while (i < length) {
                if (Character.digit((int) str.charAt(i), 10) >= 0) {
                    if (Long.compareUnsigned(j, j2) > 0) {
                        if (j2 == 512409557603043100L) {
                            j2 = Long.divideUnsigned(-1L, 10L);
                            if (Long.compareUnsigned(j, j2) > 0) {
                                return null;
                            }
                        } else {
                            return null;
                        }
                    }
                    long j3 = j * 10;
                    long m886constructorimpl = (UInt.m886constructorimpl(r9) & 4294967295L) + j3;
                    if (Long.compareUnsigned(m886constructorimpl, j3) < 0) {
                        return null;
                    }
                    i++;
                    j = m886constructorimpl;
                } else {
                    return null;
                }
            }
            return new hkj(j);
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final short i(String str) {
        vsj vsjVar;
        str.getClass();
        UInt f = f(10, str);
        if (f != null) {
            int i = f.a;
            if (Integer.compareUnsigned(i, UInt.m886constructorimpl(Settings.DEFAULT_INITIAL_WINDOW_SIZE)) <= 0) {
                vsjVar = new vsj((short) i);
                if (vsjVar == null) {
                    return vsjVar.a;
                }
                StringsKt__StringNumberConversionsKt.i(str);
                throw null;
            }
        }
        vsjVar = null;
        if (vsjVar == null) {
        }
    }
}
