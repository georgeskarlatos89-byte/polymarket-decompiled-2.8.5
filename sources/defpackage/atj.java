package defpackage;

import android.content.res.AssetFileDescriptor;
import android.media.MediaExtractor;
import android.media.MediaMetadataRetriever;
import com.launchdarkly.sdk.i;
import java.io.IOException;
import java.util.List;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.Response;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class atj implements pp8, a8k, Callback, ihl {
    public static final /* synthetic */ atj b = new atj(7);
    public static final /* synthetic */ atj c = new atj(8);
    public static final /* synthetic */ atj d = new atj(9);
    public static final /* synthetic */ atj e = new atj(10);
    public static final /* synthetic */ atj f = new atj(11);
    public static final /* synthetic */ atj g = new atj(12);
    public static final /* synthetic */ atj h = new atj(13);
    public static final /* synthetic */ atj i = new atj(14);
    public static final /* synthetic */ atj j = new atj(15);
    public static final /* synthetic */ atj k = new atj(16);
    public static final /* synthetic */ atj l = new atj(17);
    public static final /* synthetic */ atj m = new atj(18);
    public final /* synthetic */ int a;

    public /* synthetic */ atj(int i2) {
        this.a = i2;
    }

    public static final w8l a(Object obj, Object obj2) {
        w8l w8lVar = (w8l) obj;
        w8l w8lVar2 = (w8l) obj2;
        if (!w8lVar2.isEmpty()) {
            if (!w8lVar.a) {
                w8lVar = w8lVar.a();
            }
            w8lVar.c();
            if (!w8lVar2.isEmpty()) {
                w8lVar.putAll(w8lVar2);
            }
        }
        return w8lVar;
    }

    @Override // defpackage.a8k
    public void b(MediaExtractor mediaExtractor, Object obj) {
        AssetFileDescriptor assetFileDescriptor = (AssetFileDescriptor) obj;
        mediaExtractor.setDataSource(assetFileDescriptor.getFileDescriptor(), assetFileDescriptor.getStartOffset(), assetFileDescriptor.getLength());
    }

    @Override // defpackage.a8k
    public void c(MediaMetadataRetriever mediaMetadataRetriever, Object obj) {
        AssetFileDescriptor assetFileDescriptor = (AssetFileDescriptor) obj;
        mediaMetadataRetriever.setDataSource(assetFileDescriptor.getFileDescriptor(), assetFileDescriptor.getStartOffset(), assetFileDescriptor.getLength());
    }

    @Override // defpackage.pp8
    public Object f(i iVar) {
        return iVar.d;
    }

    @Override // okhttp3.Callback
    public void onFailure(Call call, IOException iOException) {
        call.getClass();
        iOException.getClass();
    }

    @Override // okhttp3.Callback
    public void onResponse(Call call, Response response) {
        call.getClass();
        response.getClass();
        response.close();
    }

    @Override // defpackage.ihl
    public Object zza() {
        switch (this.a) {
            case 7:
                List list = s1m.a;
                jal.b.a();
                return (Long) kal.a.k(1, 3600000L, "measurement.app_uninstalled_additional_ad_id_cache_time").get();
            case 8:
                List list2 = s1m.a;
                jal.b.a();
                return Integer.valueOf((int) ((Long) kal.a.k(74, 10L, "measurement.upload.max_realtime_events_per_day").get()).longValue());
            case 9:
                List list3 = s1m.a;
                jal.b.a();
                return (Long) kal.a.k(43, 21600000L, "measurement.sgtm.batch.retry_max_wait").get();
            case 10:
                List list4 = s1m.a;
                jal.b.a();
                return (Long) kal.a.k(63, 43200000L, "measurement.upload.backoff_period").get();
            case 11:
                List list5 = s1m.a;
                jal.b.a();
                return (String) kal.a.m(8, "measurement.config.url_scheme", "https").get();
            case 12:
                List list6 = s1m.a;
                qbl.b.a();
                return (String) rbl.a.m(5, "measurement.test.string_flag", "---").get();
            case 13:
                List list7 = s1m.a;
                jal.b.a();
                return Integer.valueOf((int) ((Long) kal.a.k(3, 100L, "measurement.max_bundles_per_iteration").get()).longValue());
            case 14:
                List list8 = s1m.a;
                jal.b.a();
                return (String) kal.a.m(32, "measurement.rb.attribution.app_allowlist", "").get();
            case 15:
                List list9 = s1m.a;
                jal.b.a();
                return (Boolean) kal.a.g(2, "measurement.config.bundle_for_all_apps_on_backgrounded", true).get();
            case 16:
                List list10 = s1m.a;
                return (Boolean) ncl.a.get();
            case 17:
                List list11 = s1m.a;
                sbl.b.b();
                return (Boolean) tbl.a.g(1, "measurement.rb.attribution.client2", true).get();
            default:
                return new Boolean(((Boolean) hbl.a.get()).booleanValue());
        }
    }
}
