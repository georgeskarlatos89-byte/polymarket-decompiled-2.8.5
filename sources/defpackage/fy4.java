package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class fy4 extends ddd {
    public final String c;

    public fy4(String str) {
        super(Integer.valueOf(str.length()), "the predefined string ".concat(str));
        this.c = str;
    }

    @Override // defpackage.ddd
    public final edd a(String str, int i, int i2, Object obj) {
        String obj2 = str.subSequence(i, i2).toString();
        String str2 = this.c;
        if (Intrinsics.areEqual(obj2, str2)) {
            return null;
        }
        return new tj(str2, 6);
    }
}
