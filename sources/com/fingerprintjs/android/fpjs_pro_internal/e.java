package com.fingerprintjs.android.fpjs_pro_internal;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0005\n\u0000\n\u0002\u0010\r\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "p0", "", "a", "(B)Ljava/lang/CharSequence;"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes.dex */
final class e extends Lambda implements Function1<Byte, CharSequence> {
    public static final e h = new Lambda(1);
    public static int i = 0;
    public static int j = 1;

    public e() {
        super(1);
    }

    public final CharSequence a(byte b) {
        int i2 = i;
        j = ((i2 & 81) + (i2 | 81)) % 128;
        String format = String.format("%02x", Byte.valueOf(b));
        j = (i + 97) % 128;
        return format;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ CharSequence invoke(Byte b) {
        j = (i + 83) % 128;
        CharSequence a = a(b.byteValue());
        int i2 = j + 91;
        i = i2 % 128;
        if (i2 % 2 == 0) {
            return a;
        }
        throw null;
    }
}
