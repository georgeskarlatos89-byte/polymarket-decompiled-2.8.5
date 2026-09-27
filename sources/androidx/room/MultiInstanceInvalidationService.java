package androidx.room;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import defpackage.fnc;
import defpackage.gnc;
import java.util.LinkedHashMap;
import kotlin.Metadata;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/room/MultiInstanceInvalidationService;", "Landroid/app/Service;", "<init>", "()V", "room-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class MultiInstanceInvalidationService extends Service {
    public int a;
    public final LinkedHashMap b = new LinkedHashMap();
    public final gnc c = new gnc(this);
    public final fnc d = new fnc(this);

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        intent.getClass();
        return this.d;
    }
}
