package androidx.work.impl.foreground;

import android.app.NotificationManager;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import defpackage.dm0;
import defpackage.h23;
import defpackage.kok;
import defpackage.oii;
import defpackage.ptl;
import defpackage.u7b;
import java.util.UUID;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public class SystemForegroundService extends u7b {
    public static final String f = dm0.j("SystemFgService");
    public Handler b;
    public boolean c;
    public oii d;
    public NotificationManager e;

    public final void a() {
        this.b = new Handler(Looper.getMainLooper());
        this.e = (NotificationManager) getApplicationContext().getSystemService("notification");
        oii oiiVar = new oii(getApplicationContext());
        this.d = oiiVar;
        if (oiiVar.i != null) {
            dm0.g().e(oii.j, "A callback already exists.");
        } else {
            oiiVar.i = this;
        }
    }

    @Override // defpackage.u7b, android.app.Service
    public final void onCreate() {
        super.onCreate();
        a();
    }

    @Override // defpackage.u7b, android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        this.d.f();
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        super.onStartCommand(intent, i, i2);
        if (this.c) {
            dm0.g().h(f, "Re-initializing SystemForegroundService after a request to shut-down.");
            this.d.f();
            a();
            this.c = false;
        }
        if (intent != null) {
            oii oiiVar = this.d;
            oiiVar.getClass();
            String str = oii.j;
            String action = intent.getAction();
            if ("ACTION_START_FOREGROUND".equals(action)) {
                dm0.g().h(str, "Started foreground service " + intent);
                oiiVar.b.a(new ptl(oiiVar, intent.getStringExtra("KEY_WORKSPEC_ID"), false, 14));
                oiiVar.e(intent);
                return 3;
            }
            if ("ACTION_NOTIFY".equals(action)) {
                oiiVar.e(intent);
                return 3;
            }
            if ("ACTION_CANCEL_WORK".equals(action)) {
                dm0.g().h(str, "Stopping foreground work for " + intent);
                String stringExtra = intent.getStringExtra("KEY_WORKSPEC_ID");
                if (stringExtra != null && !TextUtils.isEmpty(stringExtra)) {
                    kok kokVar = oiiVar.a;
                    UUID fromString = UUID.fromString(stringExtra);
                    kokVar.getClass();
                    kokVar.d.a(new h23(kokVar, fromString));
                    return 3;
                }
                return 3;
            }
            if ("ACTION_STOP_FOREGROUND".equals(action)) {
                dm0.g().h(str, "Stopping foreground service");
                SystemForegroundService systemForegroundService = oiiVar.i;
                if (systemForegroundService != null) {
                    systemForegroundService.c = true;
                    dm0.g().getClass();
                    systemForegroundService.stopForeground(true);
                    systemForegroundService.stopSelf();
                    return 3;
                }
                return 3;
            }
            return 3;
        }
        return 3;
    }
}
