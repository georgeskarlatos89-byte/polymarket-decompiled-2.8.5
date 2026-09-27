package defpackage;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import io.intercom.android.sdk.m5.conversation.utils.audio.AudioConstants;
import java.util.HashMap;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class bjn extends xw8 {
    public final HashMap d = new HashMap();
    public final Context e;
    public volatile p3l f;
    public final nhk g;
    public final long h;
    public final long i;

    /* JADX WARN: Type inference failed for: r3v2, types: [android.os.Handler, p3l] */
    public bjn(Context context, Looper looper) {
        ov8 ov8Var = new ov8(this, 3);
        this.e = context.getApplicationContext();
        ?? handler = new Handler(looper, ov8Var);
        Looper.getMainLooper();
        this.f = handler;
        this.g = nhk.o();
        this.h = 5000L;
        this.i = AudioConstants.MAX_RECORDING_DURATION_MS;
    }

    @Override // defpackage.xw8
    public final qw4 b(p5n p5nVar, esl eslVar, String str, Executor executor) {
        qw4 qw4Var;
        HashMap hashMap = this.d;
        synchronized (hashMap) {
            try {
                ran ranVar = (ran) hashMap.get(p5nVar);
                if (executor == null) {
                    executor = null;
                }
                if (ranVar == null) {
                    ranVar = new ran(this, p5nVar);
                    ranVar.a.put(eslVar, eslVar);
                    qw4Var = ranVar.a(executor, str);
                    hashMap.put(p5nVar, ranVar);
                } else {
                    this.f.removeMessages(0, p5nVar);
                    if (!ranVar.a.containsKey(eslVar)) {
                        ranVar.a.put(eslVar, eslVar);
                        int i = ranVar.b;
                        if (i != 1) {
                            if (i == 2) {
                                qw4Var = ranVar.a(executor, str);
                            }
                        } else {
                            eslVar.onServiceConnected(ranVar.f, ranVar.d);
                        }
                        qw4Var = null;
                    } else {
                        String p5nVar2 = p5nVar.toString();
                        StringBuilder sb = new StringBuilder(p5nVar2.length() + 81);
                        sb.append("Trying to bind a GmsServiceConnection that was already connected before.  config=");
                        sb.append(p5nVar2);
                        throw new IllegalStateException(sb.toString());
                    }
                }
                if (ranVar.c) {
                    return qw4.f;
                }
                if (qw4Var == null) {
                    qw4Var = new qw4(-1, null, null);
                }
                return qw4Var;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
