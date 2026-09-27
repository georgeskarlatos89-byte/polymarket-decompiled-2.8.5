package defpackage;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Environment;
import android.provider.MediaStore;
import android.text.TextUtils;
import java.io.File;
import java.io.FileNotFoundException;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class tif implements oo5 {
    public static final String[] k = {"_data"};
    public final Context a;
    public final zic b;
    public final zic c;
    public final Uri d;
    public final int e;
    public final int f;
    public final ild g;
    public final Class h;
    public volatile boolean i;
    public volatile oo5 j;

    public tif(Context context, zic zicVar, zic zicVar2, Uri uri, int i, int i2, ild ildVar, Class cls) {
        this.a = context.getApplicationContext();
        this.b = zicVar;
        this.c = zicVar2;
        this.d = uri;
        this.e = i;
        this.f = i2;
        this.g = ildVar;
        this.h = cls;
    }

    @Override // defpackage.oo5
    public final void a() {
        oo5 oo5Var = this.j;
        if (oo5Var != null) {
            oo5Var.a();
        }
    }

    @Override // defpackage.oo5
    public final Class b() {
        return this.h;
    }

    public final oo5 c() {
        yic a;
        Throwable th;
        boolean isExternalStorageLegacy = Environment.isExternalStorageLegacy();
        Cursor cursor = null;
        Context context = this.a;
        Uri uri = this.d;
        ild ildVar = this.g;
        int i = this.f;
        int i2 = this.e;
        if (isExternalStorageLegacy) {
            try {
                Cursor query = context.getContentResolver().query(uri, k, null, null, null);
                if (query != null) {
                    try {
                        if (query.moveToFirst()) {
                            String string = query.getString(query.getColumnIndexOrThrow("_data"));
                            if (!TextUtils.isEmpty(string)) {
                                File file = new File(string);
                                query.close();
                                a = this.b.a(file, i2, i, ildVar);
                            } else {
                                throw new FileNotFoundException("File path was empty in media store for: " + uri);
                            }
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        cursor = query;
                        if (cursor != null) {
                            cursor.close();
                            throw th;
                        }
                        throw th;
                    }
                }
                throw new FileNotFoundException("Failed to media store entry for: " + uri);
            } catch (Throwable th3) {
                th = th3;
            }
        } else {
            boolean a2 = fgn.a(uri);
            zic zicVar = this.c;
            if (a2 && uri.getPathSegments().contains("picker")) {
                a = zicVar.a(uri, i2, i, ildVar);
            } else {
                if (context.checkSelfPermission("android.permission.ACCESS_MEDIA_LOCATION") == 0) {
                    uri = MediaStore.setRequireOriginal(uri);
                }
                a = zicVar.a(uri, i2, i, ildVar);
            }
        }
        if (a == null) {
            return null;
        }
        return a.c;
    }

    @Override // defpackage.oo5
    public final void cancel() {
        this.i = true;
        oo5 oo5Var = this.j;
        if (oo5Var != null) {
            oo5Var.cancel();
        }
    }

    @Override // defpackage.oo5
    public final void d(h6f h6fVar, no5 no5Var) {
        try {
            oo5 c = c();
            if (c == null) {
                no5Var.c(new IllegalArgumentException("Failed to build fetcher for: " + this.d));
            } else {
                this.j = c;
                if (this.i) {
                    cancel();
                } else {
                    c.d(h6fVar, no5Var);
                }
            }
        } catch (FileNotFoundException e) {
            no5Var.c(e);
        }
    }

    @Override // defpackage.oo5
    public final ep5 getDataSource() {
        return ep5.LOCAL;
    }
}
