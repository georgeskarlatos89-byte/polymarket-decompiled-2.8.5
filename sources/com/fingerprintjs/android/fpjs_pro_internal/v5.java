package com.fingerprintjs.android.fpjs_pro_internal;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "b", "()Ljava/lang/String;"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes.dex */
final class v5 extends Lambda implements Function0<String> {
    public static int i = 0;
    public static int j = 1;
    public final /* synthetic */ setOnTouchListener h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v5(setOnTouchListener setontouchlistener) {
        super(0);
        this.h = setontouchlistener;
    }

    public final String b() {
        int i2 = i;
        j = ((i2 ^ 75) + ((i2 & 75) << 1)) % 128;
        int i3 = setOnTouchListener.f + 97;
        setOnTouchListener.g = i3 % 128;
        int i4 = i3 % 2;
        setOnTouchListener setontouchlistener = this.h;
        if (i4 != 0) {
            String e = setontouchlistener.e();
            int i5 = setOnTouchListener.g + 95;
            setOnTouchListener.f = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = j;
                int i7 = (i6 & 23) + (i6 | 23);
                i = i7 % 128;
                if (i7 % 2 == 0) {
                    return e;
                }
                throw null;
            }
            throw null;
        }
        setontouchlistener.e();
        throw null;
    }

    @Override // kotlin.jvm.functions.Function0
    public final /* synthetic */ String invoke() {
        int i2 = i;
        int i3 = ((i2 | 85) << 1) - (i2 ^ 85);
        j = i3 % 128;
        int i4 = i3 % 2;
        String b = b();
        if (i4 == 0) {
            int i5 = 96 / 0;
        }
        return b;
    }
}
