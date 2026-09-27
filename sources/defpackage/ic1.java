package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class ic1 extends iz4 {
    public final xf0 f;
    public final /* synthetic */ int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ic1(Context context, nok nokVar, int i) {
        super(context, nokVar);
        this.g = i;
        this.f = new xf0(this, 2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x003d, code lost:
    
        if (r9.equals("android.intent.action.DEVICE_STORAGE_OK") == false) goto L20;
     */
    @Override // defpackage.iz4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a() {
        int i = this.g;
        Context context = this.b;
        boolean z = true;
        switch (i) {
            case 0:
                Intent registerReceiver = context.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
                if (registerReceiver == null) {
                    dm0.g().e(jc1.a, "getInitialState - null intent received");
                    return Boolean.FALSE;
                }
                int intExtra = registerReceiver.getIntExtra("status", -1);
                if (intExtra != 2 && intExtra != 5) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 1:
                Intent registerReceiver2 = context.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
                if (registerReceiver2 == null) {
                    dm0.g().e(kc1.a, "getInitialState - null intent received");
                    return Boolean.FALSE;
                }
                float intExtra2 = registerReceiver2.getIntExtra("level", -1) / registerReceiver2.getIntExtra("scale", -1);
                if (registerReceiver2.getIntExtra("status", -1) != 1 && intExtra2 <= 0.15f) {
                    z = false;
                }
                return Boolean.valueOf(z);
            default:
                Intent registerReceiver3 = context.registerReceiver(null, e());
                if (registerReceiver3 != null && registerReceiver3.getAction() != null) {
                    String action = registerReceiver3.getAction();
                    if (action != null) {
                        int hashCode = action.hashCode();
                        if (hashCode != -1181163412) {
                            if (hashCode == -730838620) {
                                break;
                            }
                        } else {
                            action.equals("android.intent.action.DEVICE_STORAGE_LOW");
                        }
                    }
                    z = false;
                }
                return Boolean.valueOf(z);
        }
    }

    @Override // defpackage.iz4
    public final void c() {
        dm0 g = dm0.g();
        int i = po1.a;
        g.getClass();
        this.b.registerReceiver(this.f, e());
    }

    @Override // defpackage.iz4
    public final void d() {
        dm0 g = dm0.g();
        int i = po1.a;
        g.getClass();
        this.b.unregisterReceiver(this.f);
    }

    public final IntentFilter e() {
        switch (this.g) {
            case 0:
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.os.action.CHARGING");
                intentFilter.addAction("android.os.action.DISCHARGING");
                return intentFilter;
            case 1:
                IntentFilter intentFilter2 = new IntentFilter();
                intentFilter2.addAction("android.intent.action.BATTERY_OKAY");
                intentFilter2.addAction("android.intent.action.BATTERY_LOW");
                return intentFilter2;
            default:
                IntentFilter intentFilter3 = new IntentFilter();
                intentFilter3.addAction("android.intent.action.DEVICE_STORAGE_OK");
                intentFilter3.addAction("android.intent.action.DEVICE_STORAGE_LOW");
                return intentFilter3;
        }
    }
}
