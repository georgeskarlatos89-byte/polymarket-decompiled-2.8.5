package defpackage;

import kotlin.jvm.functions.Function1;
import skip.foundation.Notification;
import skip.lib.Dictionary;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final /* synthetic */ class fad implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Notification b;

    public /* synthetic */ fad(Notification notification, int i) {
        this.a = i;
        this.b = notification;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        Notification notification = this.b;
        switch (i) {
            case 0:
                return Notification.b(notification, (Dictionary) obj);
            default:
                return Notification.a(notification, obj);
        }
    }
}
