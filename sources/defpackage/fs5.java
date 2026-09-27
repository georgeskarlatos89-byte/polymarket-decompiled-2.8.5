package defpackage;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import com.google.android.libraries.places.api.model.PlaceTypes;
import io.radar.sdk.RadarTrackingOptions;
import java.io.File;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.LinkedList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.e;
import org.json.JSONObject;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class fs5 extends SQLiteOpenHelper {
    public final xrb a;
    public final File b;
    public boolean c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fs5(Context context, String str, xrb xrbVar) {
        super(context, str, (SQLiteDatabase.CursorFactory) null, 4);
        context.getClass();
        xrbVar.getClass();
        this.a = xrbVar;
        File databasePath = context.getDatabasePath(str);
        databasePath.getClass();
        this.b = databasePath;
        this.c = true;
        this.d = 4;
    }

    public static void g(RuntimeException runtimeException) {
        String message = runtimeException.getMessage();
        if (message != null) {
            if (message.length() != 0) {
                if (!e.u(message, "Cursor window allocation of", false) && !e.u(message, "Could not allocate CursorWindow", false)) {
                    throw runtimeException;
                }
                throw new RuntimeException(message);
            }
            throw runtimeException;
        }
        throw runtimeException;
    }

    public final void A(long j, String str) {
        try {
            try {
                try {
                    getWritableDatabase().delete(str, "id = ?", new String[]{String.valueOf(j)});
                } catch (StackOverflowError e) {
                    krb.b.c("remove events from " + str + " failed: " + e.getMessage());
                    e();
                }
            } catch (SQLiteException e2) {
                krb.b.c("remove events from " + str + " failed: " + e2.getMessage());
                e();
            }
        } finally {
            close();
        }
    }

    public final synchronized void D(String str) {
        G(str);
    }

    public final void G(String str) {
        try {
            try {
                getWritableDatabase().delete("long_store", "key = ?", new String[]{str});
            } catch (SQLiteException e) {
                krb.b.c("remove value from long_store failed: " + e.getMessage());
                e();
            } catch (StackOverflowError e2) {
                krb.b.c("remove value from long_store failed: " + e2.getMessage());
                e();
            }
        } finally {
            close();
        }
    }

    public final void e() {
        try {
            close();
        } catch (Exception e) {
            krb krbVar = krb.b;
            krb.b.c("close failed: " + e.getMessage());
        }
    }

    public final synchronized Long o(String str) {
        return (Long) p("long_store", str);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.getClass();
        this.c = false;
        this.a.c("Attempt to re-create existing legacy database file " + this.b.getAbsolutePath());
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        this.d = i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x00d8, code lost:
    
        if (r14 != null) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0090, code lost:
    
        if (r14 == null) goto L51;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00b9  */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v2, types: [android.database.Cursor] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object p(String str, String str2) {
        Throwable th;
        RuntimeException runtimeException;
        IllegalStateException illegalStateException;
        Cursor cursor;
        String str3;
        StackOverflowError stackOverflowError;
        SQLiteException sQLiteException;
        Object valueOf;
        ?? r3 = 0;
        Object obj = null;
        try {
            if (this.b.exists()) {
                try {
                    try {
                        SQLiteDatabase readableDatabase = getReadableDatabase();
                        if (!this.c) {
                            close();
                            return null;
                        }
                        readableDatabase.getClass();
                        str3 = str;
                        try {
                            cursor = readableDatabase.query(str3, new String[]{"key", "value"}, "key = ?", new String[]{str2}, null, null, null, null);
                        } catch (SQLiteException e) {
                            e = e;
                            sQLiteException = e;
                            cursor = null;
                            krb.b.c("getValue from " + str3 + " failed: " + sQLiteException.getMessage());
                            e();
                        } catch (StackOverflowError e2) {
                            e = e2;
                            stackOverflowError = e;
                            cursor = null;
                            krb.b.c("getValue from " + str3 + " failed: " + stackOverflowError.getMessage());
                            e();
                            if (cursor != null) {
                                cursor.close();
                            }
                            close();
                            return null;
                        }
                        try {
                            cursor.getClass();
                            if (cursor.moveToFirst()) {
                                if (Intrinsics.areEqual(str3, PlaceTypes.STORE)) {
                                    valueOf = cursor.getString(1);
                                } else {
                                    valueOf = Long.valueOf(cursor.getLong(1));
                                }
                                obj = valueOf;
                            }
                            cursor.close();
                            close();
                            return obj;
                        } catch (SQLiteException e3) {
                            sQLiteException = e3;
                            krb.b.c("getValue from " + str3 + " failed: " + sQLiteException.getMessage());
                            e();
                        } catch (IllegalStateException e4) {
                            illegalStateException = e4;
                            y(illegalStateException);
                        } catch (RuntimeException e5) {
                            runtimeException = e5;
                            g(runtimeException);
                            throw null;
                        } catch (StackOverflowError e6) {
                            stackOverflowError = e6;
                            krb.b.c("getValue from " + str3 + " failed: " + stackOverflowError.getMessage());
                            e();
                            if (cursor != null) {
                            }
                            close();
                            return null;
                        }
                    } catch (SQLiteException e7) {
                        e = e7;
                        str3 = str;
                    } catch (StackOverflowError e8) {
                        e = e8;
                        str3 = str;
                    }
                } catch (IllegalStateException e9) {
                    illegalStateException = e9;
                    cursor = null;
                } catch (RuntimeException e10) {
                    runtimeException = e10;
                } catch (Throwable th2) {
                    th = th2;
                    if (r3 != 0) {
                        r3.close();
                    }
                    close();
                    throw th;
                }
            }
            return null;
        } catch (Throwable th3) {
            th = th3;
            r3 = str;
        }
    }

    public final void y(IllegalStateException illegalStateException) {
        String message = illegalStateException.getMessage();
        if (message != null) {
            if (message.length() != 0) {
                if (StringsKt.L(message, "Couldn't read", false)) {
                    if (StringsKt.L(message, "CursorWindow", false)) {
                        e();
                        return;
                    }
                    throw illegalStateException;
                }
                throw illegalStateException;
            }
            throw illegalStateException;
        }
        throw illegalStateException;
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x00f3, code lost:
    
        if (r4 == null) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00a5, code lost:
    
        if (r4 == null) goto L57;
     */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00f9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final AbstractList z(String str) {
        RuntimeException runtimeException;
        Cursor cursor;
        String str2;
        Throwable th;
        if (!this.b.exists()) {
            return new ArrayList();
        }
        LinkedList linkedList = new LinkedList();
        Cursor cursor2 = null;
        try {
            try {
                try {
                    SQLiteDatabase readableDatabase = getReadableDatabase();
                    if (!this.c) {
                        ArrayList arrayList = new ArrayList();
                        close();
                        return arrayList;
                    }
                    readableDatabase.getClass();
                    str2 = str;
                    try {
                        Cursor query = readableDatabase.query(str2, new String[]{RadarTrackingOptions.RadarTrackingOptionsForegroundService.KEY_FOREGROUND_SERVICE_ID, "event"}, null, null, null, null, "id ASC", null);
                        while (true) {
                            try {
                                query.getClass();
                                if (query.moveToNext()) {
                                    long j = query.getLong(0);
                                    String string = query.getString(1);
                                    if (string != null && string.length() != 0) {
                                        JSONObject jSONObject = new JSONObject(string);
                                        jSONObject.put("$rowId", j);
                                        linkedList.add(jSONObject);
                                    }
                                } else {
                                    query.close();
                                    close();
                                    return linkedList;
                                }
                            } catch (SQLiteException e) {
                                e = e;
                                cursor2 = query;
                                krb.b.c("read events from " + str2 + " failed: " + e.getMessage());
                                e();
                            } catch (IllegalStateException e2) {
                                e = e2;
                                cursor2 = query;
                                y(e);
                            } catch (RuntimeException e3) {
                                cursor = query;
                                runtimeException = e3;
                                try {
                                    g(runtimeException);
                                    throw null;
                                } catch (Throwable th2) {
                                    th = th2;
                                    cursor2 = cursor;
                                    if (cursor2 != null) {
                                        cursor2.close();
                                    }
                                    close();
                                    throw th;
                                }
                            } catch (StackOverflowError e4) {
                                e = e4;
                                cursor2 = query;
                                krb.b.c("read events from " + str2 + " failed: " + e.getMessage());
                                e();
                                if (cursor2 != null) {
                                    cursor2.close();
                                }
                                close();
                                return linkedList;
                            } catch (Throwable th3) {
                                th = th3;
                                cursor2 = query;
                                th = th;
                                if (cursor2 != null) {
                                }
                                close();
                                throw th;
                            }
                        }
                    } catch (SQLiteException e5) {
                        e = e5;
                    } catch (StackOverflowError e6) {
                        e = e6;
                    }
                } catch (Throwable th4) {
                    th = th4;
                }
            } catch (SQLiteException e7) {
                e = e7;
                str2 = str;
            } catch (StackOverflowError e8) {
                e = e8;
                str2 = str;
            }
        } catch (IllegalStateException e9) {
            e = e9;
        } catch (RuntimeException e10) {
            runtimeException = e10;
            cursor = null;
        }
    }
}
