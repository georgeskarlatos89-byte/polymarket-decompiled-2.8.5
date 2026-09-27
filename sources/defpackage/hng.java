package defpackage;

import android.os.Debug;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class hng extends mng {
    public static final pgk c = new pgk("SW04", "A debugger is attached to the App.", ogk.MEDIUM);
    public final boolean b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hng() {
        super(c);
        boolean isDebuggerConnected = Debug.isDebuggerConnected();
        this.b = isDebuggerConnected;
    }

    @Override // defpackage.mng
    public final boolean a() {
        return this.b;
    }
}
