package com.fingerprintjs.android.fpjs_pro_internal;

import android.content.ContentResolver;
import android.provider.Settings;
import com.fingerprintjs.android.fpjs_pro_internal.C1722;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "b", "()Ljava/lang/String;"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes.dex */
final class r1 extends Lambda implements Function0<String> {
    public static int i = 0;
    public static int j = 1;
    public final /* synthetic */ s1 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r1(s1 s1Var) {
        super(0);
        this.h = s1Var;
    }

    public final String b() {
        j = (i + 107) % 128;
        int i2 = (s1.c + 93) % 128;
        s1.b = i2;
        ContentResolver contentResolver = this.h.a;
        s1.c = (((i2 | 73) << 1) - (i2 ^ 73)) % 128;
        contentResolver.getClass();
        String string = Settings.Global.getString(contentResolver, C1722.pc.e.setPivotYN16904());
        string.getClass();
        j = (i + 117) % 128;
        return string;
    }

    @Override // kotlin.jvm.functions.Function0
    public final /* synthetic */ String invoke() {
        int i2 = j + 39;
        i = i2 % 128;
        if (i2 % 2 == 0) {
            String b = b();
            int i3 = j;
            i = ((i3 ^ 49) + ((i3 & 49) << 1)) % 128;
            return b;
        }
        b();
        throw null;
    }
}
