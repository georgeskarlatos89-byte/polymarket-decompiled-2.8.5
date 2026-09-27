package defpackage;

import com.polymarket.clients.WSConnection;
import com.polymarket.clients.WSConnectionMessage;
import io.sentry.android.core.m0;
import java.net.URI;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.WebSocket;
import okhttp3.internal.ws.WebSocketProtocol;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class wz implements WSConnection {
    public static final Lazy m = LazyKt.lazy(new oa(13));
    public final URI a;
    public final Map b;
    public final double c;
    public volatile boolean d;
    public volatile boolean e;
    public volatile boolean f;
    public volatile Throwable g;
    public volatile WebSocket j;
    public final Object h = new Object();
    public final eq1 i = vmn.a(bd0.API_PRIORITY_OTHER, 6, null);
    public final Lazy k = LazyKt.lazy(new ke(this, 8));
    public final uz l = new uz(this);

    public wz(URI uri, Map map, double d) {
        this.a = uri;
        this.b = map;
        this.c = d;
    }

    public final void a(int i, String str) {
        synchronized (this.h) {
            if (!this.e && !this.f) {
                this.d = false;
                eq1 eq1Var = this.i;
                WSConnectionMessage.Companion companion = WSConnectionMessage.INSTANCE;
                if (str.length() == 0) {
                    str = null;
                }
                eq1Var.f(companion.closed(i, str));
                b(null);
            }
        }
    }

    public final void b(Throwable th) {
        synchronized (this.h) {
            try {
                if (this.e) {
                    return;
                }
                this.e = true;
                this.d = false;
                if (th != null && this.g == null) {
                    this.g = th;
                }
                Throwable th2 = this.g;
                if (th2 != null) {
                    m0.e("AndroidClientWebSocket", "WebSocket completed with error: " + th2.getMessage(), th2);
                }
                this.i.c(th2, false);
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    @Override // com.polymarket.clients.WSConnection
    public final void closeConnection() {
        synchronized (this.h) {
            if (this.e) {
                return;
            }
            this.f = true;
            this.d = false;
            WebSocket webSocket = this.j;
            if (webSocket != null && !webSocket.close(WebSocketProtocol.CLOSE_CLIENT_GOING_AWAY, null)) {
                webSocket.cancel();
            }
            b(null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // com.polymarket.clients.WSConnection
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object receiveMessage(Continuation continuation) {
        vz vzVar;
        int i;
        Object H;
        WSConnectionMessage wSConnectionMessage;
        if (continuation instanceof vz) {
            vzVar = (vz) continuation;
            int i2 = vzVar.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                vzVar.m = i2 - Integer.MIN_VALUE;
                Object obj = vzVar.k;
                u85 u85Var = u85.COROUTINE_SUSPENDED;
                i = vzVar.m;
                if (i == 0) {
                    if (i == 1) {
                        ResultKt.a(obj);
                        H = ((hh3) obj).a;
                    } else {
                        dmk.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    ResultKt.a(obj);
                    eq1 eq1Var = this.i;
                    vzVar.m = 1;
                    eq1Var.getClass();
                    H = eq1.H(eq1Var, vzVar);
                    if (H == u85Var) {
                        return u85Var;
                    }
                }
                wSConnectionMessage = (WSConnectionMessage) hh3.b(H);
                if (wSConnectionMessage == null) {
                    return wSConnectionMessage;
                }
                Throwable th = this.g;
                if (th == null) {
                    throw new IllegalStateException("WebSocket connection is closed");
                }
                throw th;
            }
        }
        vzVar = new vz(this, continuation);
        Object obj2 = vzVar.k;
        u85 u85Var2 = u85.COROUTINE_SUSPENDED;
        i = vzVar.m;
        if (i == 0) {
        }
        wSConnectionMessage = (WSConnectionMessage) hh3.b(H);
        if (wSConnectionMessage == null) {
        }
    }

    @Override // com.polymarket.clients.WSConnection
    public final void resume() {
        synchronized (this.h) {
            try {
                if (!this.e && this.j == null) {
                    Request.Builder builder = new Request.Builder();
                    String uri = this.a.toString();
                    uri.getClass();
                    Request.Builder url = builder.url(uri);
                    for (Map.Entry entry : this.b.entrySet()) {
                        url.addHeader((String) entry.getKey(), (String) entry.getValue());
                    }
                    this.j = ((OkHttpClient) this.k.getValue()).newWebSocket(url.build(), this.l);
                    this.d = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.polymarket.clients.WSConnection
    public final Object sendPing(Continuation continuation) {
        Throwable th = this.g;
        if (th == null) {
            boolean z = this.d;
            WebSocket webSocket = this.j;
            if (z && webSocket != null) {
                return Unit.INSTANCE;
            }
            dmk.n("WebSocket connection is not running");
            return null;
        }
        throw th;
    }

    @Override // com.polymarket.clients.WSConnection
    public final Object sendString(String str, Continuation continuation) {
        Throwable th = this.g;
        if (th == null) {
            boolean z = this.d;
            WebSocket webSocket = this.j;
            if (z && webSocket != null) {
                if (webSocket.send(str)) {
                    return Unit.INSTANCE;
                }
                m0.e("AndroidClientWebSocket", "OUT enqueue failed", null);
                dmk.n("Failed to enqueue websocket message");
                return null;
            }
            dmk.n("WebSocket connection is not running");
            return null;
        }
        throw th;
    }
}
