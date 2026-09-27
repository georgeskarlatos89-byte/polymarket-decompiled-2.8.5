package defpackage;

import android.content.BroadcastReceiver;
import android.content.IntentFilter;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class mob {
    public final IntentFilter a;
    public final BroadcastReceiver b;
    public boolean c;
    public boolean d;

    public mob(IntentFilter intentFilter, BroadcastReceiver broadcastReceiver) {
        this.a = intentFilter;
        this.b = broadcastReceiver;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("Receiver{");
        sb.append(this.b);
        sb.append(" filter=");
        sb.append(this.a);
        if (this.d) {
            sb.append(" DEAD");
        }
        sb.append("}");
        return sb.toString();
    }
}
