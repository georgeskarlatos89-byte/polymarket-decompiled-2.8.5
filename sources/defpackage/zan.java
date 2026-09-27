package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.compose.ui.node.LayoutNode;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.functions.Function1;
import okhttp3.Response;
import okhttp3.ResponseBody;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public abstract class zan {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x004a A[Catch: Exception -> 0x0072, TryCatch #0 {Exception -> 0x0072, blocks: (B:10:0x0024, B:11:0x003a, B:15:0x004a, B:18:0x005a, B:20:0x0062, B:21:0x0066, B:27:0x0031), top: B:7:0x0020 }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x005a A[Catch: Exception -> 0x0072, TryCatch #0 {Exception -> 0x0072, blocks: (B:10:0x0024, B:11:0x003a, B:15:0x004a, B:18:0x005a, B:20:0x0062, B:21:0x0066, B:27:0x0031), top: B:7:0x0020 }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(Function1 function1, q55 q55Var) {
        q1l q1lVar;
        int i;
        Object obj;
        Response response;
        try {
            if (q55Var instanceof q1l) {
                q1l q1lVar2 = (q1l) q55Var;
                int i2 = q1lVar2.l;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    q1lVar2.l = i2 - Integer.MIN_VALUE;
                    q1lVar = q1lVar2;
                    Object obj2 = q1lVar.k;
                    u85 u85Var = u85.COROUTINE_SUSPENDED;
                    i = q1lVar.l;
                    String str = null;
                    if (i == 0) {
                        if (i == 1) {
                            ResultKt.a(obj2);
                        } else {
                            dmk.n("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                    } else {
                        ResultKt.a(obj2);
                        q1lVar.l = 1;
                        obj2 = function1.invoke(q1lVar);
                        if (obj2 == u85Var) {
                            return u85Var;
                        }
                    }
                    y4g y4gVar = (y4g) obj2;
                    obj = y4gVar.b;
                    response = y4gVar.a;
                    if (response.getIsSuccessful()) {
                        obj = null;
                    }
                    if (obj == null) {
                        Result.Companion companion = Result.INSTANCE;
                        return Result.m882constructorimpl(new Pair(response.headers(), obj));
                    }
                    Result.Companion companion2 = Result.INSTANCE;
                    ResponseBody responseBody = y4gVar.c;
                    if (responseBody != null) {
                        str = responseBody.string();
                    }
                    return Result.m882constructorimpl(ResultKt.createFailure(new Exception(str)));
                }
            }
            if (i == 0) {
            }
            y4g y4gVar2 = (y4g) obj2;
            obj = y4gVar2.b;
            response = y4gVar2.a;
            if (response.getIsSuccessful()) {
            }
            if (obj == null) {
            }
        } catch (Exception e) {
            Result.Companion companion3 = Result.INSTANCE;
            return Result.m882constructorimpl(ResultKt.createFailure(e));
        }
        q1lVar = new q55(q55Var);
        Object obj22 = q1lVar.k;
        u85 u85Var2 = u85.COROUTINE_SUSPENDED;
        i = q1lVar.l;
        String str2 = null;
    }

    public static final nub b(nub nubVar) {
        LayoutNode layoutNode;
        LayoutNode layoutNode2 = nubVar.p.p;
        while (true) {
            LayoutNode D = layoutNode2.D();
            LayoutNode layoutNode3 = null;
            if (D != null) {
                layoutNode = D.i;
            } else {
                layoutNode = null;
            }
            if (layoutNode != null) {
                LayoutNode D2 = layoutNode2.D();
                if (D2 != null) {
                    layoutNode3 = D2.i;
                }
                layoutNode3.getClass();
                if (layoutNode3.h) {
                    layoutNode2 = layoutNode2.D();
                    layoutNode2.getClass();
                } else {
                    LayoutNode D3 = layoutNode2.D();
                    D3.getClass();
                    layoutNode2 = D3.i;
                    layoutNode2.getClass();
                }
            } else {
                nub i1 = layoutNode2.getOuterCoordinator$ui().i1();
                i1.getClass();
                return i1;
            }
        }
    }

    public static void c(Context context, String str) {
        SharedPreferences.Editor edit = context.getApplicationContext().getSharedPreferences("sentry_attribution", 0).edit();
        if (str != null && str.length() != 0) {
            edit.putString("user_id", str);
        } else {
            edit.remove("user_id");
        }
        edit.apply();
    }
}
