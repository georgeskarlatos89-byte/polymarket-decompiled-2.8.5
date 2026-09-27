package defpackage;

import android.content.Context;
import android.os.Bundle;
import java.util.ArrayList;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class zuk {
    public final d1l a;
    public final String b;
    public final epi c;
    public final nhj d;
    public final htk e;

    public zuk(Context context, d1l d1lVar, nhj nhjVar) {
        epi epiVar = new epi();
        this.c = epiVar;
        this.b = context.getPackageName();
        this.a = d1lVar;
        this.d = nhjVar;
        htk htkVar = new htk(context, d1lVar, "ExpressIntegrityService", avk.a, new vbj(5));
        this.e = htkVar;
        htkVar.a().post(new dtk(this, epiVar, context));
    }

    public static Bundle a(zuk zukVar, byk bykVar, long j, long j2) {
        Bundle bundle = new Bundle();
        bundle.putString("package.name", zukVar.b);
        bundle.putLong("cloud.prj", j);
        bundle.putString("nonce", bykVar.a);
        bundle.putLong("warm.up.sid", j2);
        bundle.putInt("playcore.integrity.version.major", 1);
        bundle.putInt("playcore.integrity.version.minor", 4);
        bundle.putInt("playcore.integrity.version.patch", 0);
        bundle.putInt("webview.request.mode", 0);
        bundle.putIntegerArrayList("request.verdict.opt.out", new ArrayList<>(bykVar.b));
        ArrayList arrayList = new ArrayList();
        arrayList.add(new axk(5, System.currentTimeMillis()));
        bundle.putParcelableArrayList("event_timestamps", new ArrayList<>(w8n.b(arrayList)));
        return bundle;
    }

    public static Bundle b(zuk zukVar, long j) {
        Bundle bundle = new Bundle();
        bundle.putString("package.name", zukVar.b);
        bundle.putLong("cloud.prj", j);
        bundle.putInt("playcore.integrity.version.major", 1);
        bundle.putInt("playcore.integrity.version.minor", 4);
        bundle.putInt("playcore.integrity.version.patch", 0);
        bundle.putInt("webview.request.mode", 0);
        ArrayList arrayList = new ArrayList();
        arrayList.add(new axk(4, System.currentTimeMillis()));
        bundle.putParcelableArrayList("event_timestamps", new ArrayList<>(w8n.b(arrayList)));
        return bundle;
    }

    public static boolean c(zuk zukVar) {
        if (zukVar.c.a.isSuccessful() && ((Integer) zukVar.c.a.getResult()).intValue() < 83420000) {
            return true;
        }
        return false;
    }

    public static boolean d(zuk zukVar) {
        if (zukVar.c.a.isSuccessful() && ((Integer) zukVar.c.a.getResult()).intValue() == 0) {
            return true;
        }
        return false;
    }
}
