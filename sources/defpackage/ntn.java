package defpackage;

import android.database.Cursor;
import io.getstream.chat.android.models.Reaction;
import io.getstream.chat.android.models.User;
import java.util.LinkedHashMap;
import kotlin.ResultKt;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public abstract class ntn {
    public static final int a(Cursor cursor, String str) {
        cursor.getClass();
        int columnIndex = cursor.getColumnIndex(str);
        if (columnIndex >= 0) {
            return columnIndex;
        }
        int columnIndex2 = cursor.getColumnIndex("`" + str + '`');
        if (columnIndex2 >= 0) {
            return columnIndex2;
        }
        return -1;
    }

    public static final int b(Cursor cursor, String str) {
        String str2;
        cursor.getClass();
        int a = a(cursor, str);
        if (a >= 0) {
            return a;
        }
        try {
            String[] columnNames = cursor.getColumnNames();
            columnNames.getClass();
            str2 = ArraysKt.J(columnNames, null, null, null, null, 63);
        } catch (Exception unused) {
            str2 = "unknown";
        }
        dmk.v(m51.k("column '", str, "' does not exist. Available columns: ", str2));
        return 0;
    }

    public static final hof c(Reaction reaction) {
        reaction.getClass();
        return new hof(reaction.getMessageId(), reaction.fetchUserId(), reaction.getType(), reaction.getScore(), reaction.getCreatedAt(), reaction.getCreatedLocallyAt(), reaction.getUpdatedAt(), reaction.getDeletedAt(), reaction.getEnforceUnique(), reaction.getSkipPush(), reaction.getEmojiCode(), reaction.getExtraData(), reaction.getSyncStatus());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object d(hof hofVar, Function2 function2, q55 q55Var) {
        jof jofVar;
        int i;
        String str;
        String str2;
        int i2;
        hof hofVar2 = hofVar;
        if (q55Var instanceof jof) {
            jof jofVar2 = (jof) q55Var;
            int i3 = jofVar2.p;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                jofVar2.p = i3 - Integer.MIN_VALUE;
                jofVar = jofVar2;
                Object obj = jofVar.o;
                u85 u85Var = u85.COROUTINE_SUSPENDED;
                i = jofVar.p;
                if (i == 0) {
                    if (i == 1) {
                        int i4 = jofVar.n;
                        str = jofVar.m;
                        String str3 = jofVar.l;
                        hof hofVar3 = jofVar.k;
                        ResultKt.a(obj);
                        i2 = i4;
                        hofVar2 = hofVar3;
                        str2 = str3;
                    } else {
                        dmk.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    ResultKt.a(obj);
                    String str4 = hofVar2.a;
                    String str5 = hofVar2.c;
                    int i5 = hofVar2.d;
                    String str6 = hofVar2.b;
                    jofVar.k = hofVar2;
                    jofVar.l = str4;
                    jofVar.m = str5;
                    jofVar.n = i5;
                    jofVar.p = 1;
                    Object invoke = function2.invoke(str6, jofVar);
                    if (invoke == u85Var) {
                        return u85Var;
                    }
                    str = str5;
                    obj = invoke;
                    str2 = str4;
                    i2 = i5;
                }
                User user = (User) obj;
                LinkedHashMap p = d1c.p(hofVar2.l);
                return new Reaction(str2, str, i2, user, hofVar2.b, hofVar2.e, hofVar2.f, hofVar2.g, hofVar2.h, hofVar2.m, p, hofVar2.i, hofVar2.j, hofVar2.k);
            }
        }
        jofVar = new q55(q55Var);
        Object obj2 = jofVar.o;
        u85 u85Var2 = u85.COROUTINE_SUSPENDED;
        i = jofVar.p;
        if (i == 0) {
        }
        User user2 = (User) obj2;
        LinkedHashMap p2 = d1c.p(hofVar2.l);
        return new Reaction(str2, str, i2, user2, hofVar2.b, hofVar2.e, hofVar2.f, hofVar2.g, hofVar2.h, hofVar2.m, p2, hofVar2.i, hofVar2.j, hofVar2.k);
    }
}
