package defpackage;

import java.util.Random;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class wv7 extends s4 {
    public final a c = new ThreadLocal();

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    /* loaded from: classes6.dex */
    public static final class a extends ThreadLocal {
        @Override // java.lang.ThreadLocal
        public final Object initialValue() {
            return new Random();
        }
    }

    @Override // defpackage.s4
    public final Random h() {
        Object obj = this.c.get();
        obj.getClass();
        return (Random) obj;
    }
}
