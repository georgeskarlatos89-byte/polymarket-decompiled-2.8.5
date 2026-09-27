package defpackage;

import android.content.ContentResolver;
import android.content.res.AssetManager;
import android.net.Uri;
import android.util.Log;
import java.io.FileNotFoundException;
import java.io.IOException;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public abstract class lm0 implements oo5 {
    public final /* synthetic */ int a;
    public Object b;
    public final Comparable c;
    public final Object d;

    public /* synthetic */ lm0(int i, Comparable comparable, Object obj) {
        this.a = i;
        this.d = obj;
        this.c = comparable;
    }

    @Override // defpackage.oo5
    public final void a() {
        switch (this.a) {
            case 0:
                Object obj = this.b;
                if (obj != null) {
                    try {
                        f(obj);
                    } catch (IOException unused) {
                        return;
                    }
                }
                return;
            default:
                Object obj2 = this.b;
                if (obj2 != null) {
                    try {
                        f(obj2);
                        return;
                    } catch (IOException unused2) {
                        return;
                    }
                }
                return;
        }
    }

    @Override // defpackage.oo5
    public final void cancel() {
        int i = this.a;
    }

    @Override // defpackage.oo5
    public final void d(h6f h6fVar, no5 no5Var) {
        int i = this.a;
        Object obj = this.d;
        Comparable comparable = this.c;
        switch (i) {
            case 0:
                try {
                    Object h = h((AssetManager) obj, (String) comparable);
                    this.b = h;
                    no5Var.q(h);
                    return;
                } catch (IOException e) {
                    Log.isLoggable("AssetPathFetcher", 3);
                    no5Var.c(e);
                    return;
                }
            default:
                try {
                    Object g = g((ContentResolver) obj, (Uri) comparable);
                    this.b = g;
                    no5Var.q(g);
                    return;
                } catch (FileNotFoundException e2) {
                    Log.isLoggable("LocalUriFetcher", 3);
                    no5Var.c(e2);
                    return;
                }
        }
    }

    public abstract void f(Object obj);

    public abstract Object g(ContentResolver contentResolver, Uri uri);

    @Override // defpackage.oo5
    public final ep5 getDataSource() {
        switch (this.a) {
            case 0:
                return ep5.LOCAL;
            default:
                return ep5.LOCAL;
        }
    }

    public abstract Object h(AssetManager assetManager, String str);

    private final void c() {
    }

    private final void e() {
    }
}
