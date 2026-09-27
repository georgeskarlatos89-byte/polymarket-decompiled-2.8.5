package defpackage;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final /* synthetic */ class hcg implements icg {
    public final /* synthetic */ long a;
    public final /* synthetic */ my0 b;

    public /* synthetic */ hcg(long j, my0 my0Var) {
        this.a = j;
        this.b = my0Var;
    }

    @Override // defpackage.icg
    public final Object apply(Object obj) {
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        ContentValues contentValues = new ContentValues();
        contentValues.put("next_request_ms", Long.valueOf(this.a));
        my0 my0Var = this.b;
        String str = my0Var.a;
        f6f f6fVar = my0Var.c;
        if (sQLiteDatabase.update("transport_contexts", contentValues, "backend_name = ? and priority = ?", new String[]{str, String.valueOf(j6f.a(f6fVar))}) < 1) {
            contentValues.put("backend_name", str);
            contentValues.put("priority", Integer.valueOf(j6f.a(f6fVar)));
            sQLiteDatabase.insert("transport_contexts", null, contentValues);
        }
        return null;
    }
}
