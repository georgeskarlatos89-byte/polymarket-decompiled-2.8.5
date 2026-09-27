package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.view.GestureDetector;
import android.view.ViewConfiguration;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.mlkit.common.MlKitException;
import com.launchdarkly.sdk.i;
import java.io.InputStream;
import java.util.List;
import java.util.Objects;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class yej implements ajc, pp8, ld5, xbi, ihl, yym, sbj {
    public static final /* synthetic */ yej b = new yej(6);
    public static final /* synthetic */ yej c = new yej(8);
    public static final /* synthetic */ yej d = new yej(9);
    public static final /* synthetic */ yej e = new yej(10);
    public static final /* synthetic */ yej f = new yej(11);
    public static final /* synthetic */ yej g = new yej(12);
    public static final /* synthetic */ yej h = new yej(13);
    public static final /* synthetic */ yej i = new yej(14);
    public static final /* synthetic */ yej j = new yej(15);
    public static final /* synthetic */ yej k = new yej(16);
    public static final /* synthetic */ yej l = new yej(17);
    public static final /* synthetic */ yej m = new yej(18);
    public static final /* synthetic */ yej n = new yej(19);
    public final /* synthetic */ int a;

    public yej(Context context, xbc xbcVar) {
        this.a = 4;
        ViewConfiguration.get(context).getScaledTouchSlop();
        new GestureDetector(context, new vrk(this));
    }

    public static final CharSequence a(Object obj) {
        Objects.requireNonNull(obj);
        if (obj instanceof CharSequence) {
            return (CharSequence) obj;
        }
        return obj.toString();
    }

    @Override // defpackage.sbj
    public Object apply(Object obj) {
        return (byte[]) obj;
    }

    @Override // defpackage.yym
    public z1n c(Class cls) {
        throw new IllegalStateException("This should never be called.");
    }

    @Override // defpackage.yym
    public boolean d(Class cls) {
        return false;
    }

    @Override // defpackage.pp8
    public Object f(i iVar) {
        return iVar.i;
    }

    @Override // defpackage.ajc
    public zic l0(m64 m64Var) {
        return new eyj(m64Var.p(iw8.class, InputStream.class));
    }

    @Override // defpackage.xbi
    public Task then(Object obj) {
        Bundle bundle = (Bundle) obj;
        int i2 = kbg.h;
        if (bundle != null && bundle.containsKey("google.messenger")) {
            return Tasks.d(null);
        }
        return Tasks.d(bundle);
    }

    @Override // defpackage.ihl
    public Object zza() {
        switch (this.a) {
            case 8:
                List list = s1m.a;
                return (String) xal.b.get();
            case 9:
                List list2 = s1m.a;
                jal.b.a();
                return (String) kal.a.m(44, "measurement.sgtm.service_upload_apps_list", "").get();
            case 10:
                List list3 = s1m.a;
                jal.b.a();
                return (Long) kal.a.k(50, 5000L, "measurement.sgtm.upload.min_delay_after_startup").get();
            case 11:
                List list4 = s1m.a;
                jal.b.a();
                return (Long) kal.a.k(9, 1000L, "measurement.upload.debug_upload_interval").get();
            case 12:
                List list5 = s1m.a;
                jal.b.a();
                return (Long) kal.a.k(15, 605000L, "measurement.upload.google_signal_max_queue_time").get();
            case 13:
                List list6 = s1m.a;
                qbl.b.a();
                return Integer.valueOf((int) ((Long) rbl.a.k(3, -2L, "measurement.test.int_flag").get()).longValue());
            case 14:
                List list7 = s1m.a;
                jal.b.a();
                return Integer.valueOf((int) ((Long) kal.a.k(26, 7L, "measurement.rb.attribution.client.min_ad_services_version").get()).longValue());
            case 15:
                List list8 = s1m.a;
                jal.b.a();
                return Integer.valueOf((int) ((Long) kal.a.k(75, 65536L, "measurement.upload.max_batch_size").get()).longValue());
            case 16:
                List list9 = s1m.a;
                jal.b.a();
                return (Long) kal.a.k(11, 3600000L, "45769094").get();
            case 17:
                List list10 = s1m.a;
                return (Boolean) bbl.a.get();
            case MlKitException.UNSUPPORTED /* 18 */:
                List list11 = s1m.a;
                return (Boolean) vbl.a.get();
            default:
                return new Boolean(((Boolean) dcl.a.get()).booleanValue());
        }
    }

    public /* synthetic */ yej(int i2) {
        this.a = i2;
    }
}
