package defpackage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Objects;
import okhttp3.Call;
import okhttp3.FormBody;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class chd implements bv2 {
    public final b2g a;
    public final Object b;
    public final Object[] c;
    public final Call.Factory d;
    public final n65 e;
    public volatile boolean f;
    public Call g;
    public Throwable h;
    public boolean i;

    public chd(b2g b2gVar, Object obj, Object[] objArr, Call.Factory factory, n65 n65Var) {
        this.a = b2gVar;
        this.b = obj;
        this.c = objArr;
        this.d = factory;
        this.e = n65Var;
    }

    public final Call a() {
        HttpUrl resolve;
        b2g b2gVar = this.a;
        xln[] xlnVarArr = b2gVar.k;
        Object[] objArr = this.c;
        int length = objArr.length;
        if (length == xlnVarArr.length) {
            q1g q1gVar = new q1g(b2gVar.d, b2gVar.c, b2gVar.e, b2gVar.f, b2gVar.g, b2gVar.h, b2gVar.i, b2gVar.j);
            if (b2gVar.l) {
                length--;
            }
            ArrayList arrayList = new ArrayList(length);
            for (int i = 0; i < length; i++) {
                arrayList.add(objArr[i]);
                xlnVarArr[i].b(q1gVar, objArr[i]);
            }
            HttpUrl.Builder builder = q1gVar.d;
            if (builder != null) {
                resolve = builder.build();
            } else {
                String str = q1gVar.c;
                HttpUrl httpUrl = q1gVar.b;
                resolve = httpUrl.resolve(str);
                if (resolve == null) {
                    StringBuilder sb = new StringBuilder("Malformed URL. Base: ");
                    sb.append(httpUrl);
                    ahh.n(sb, ", Relative: ", q1gVar.c);
                    return null;
                }
            }
            RequestBody requestBody = q1gVar.k;
            if (requestBody == null) {
                FormBody.Builder builder2 = q1gVar.j;
                if (builder2 != null) {
                    requestBody = builder2.build();
                } else {
                    MultipartBody.Builder builder3 = q1gVar.i;
                    if (builder3 != null) {
                        requestBody = builder3.build();
                    } else if (q1gVar.h) {
                        requestBody = RequestBody.create((MediaType) null, new byte[0]);
                    }
                }
            }
            MediaType mediaType = q1gVar.g;
            Headers.Builder builder4 = q1gVar.f;
            if (mediaType != null) {
                if (requestBody != null) {
                    requestBody = new p1g(requestBody, mediaType);
                } else {
                    builder4.add("Content-Type", mediaType.toString());
                }
            }
            Call newCall = this.d.newCall(q1gVar.e.url(resolve).headers(builder4.build()).method(q1gVar.a, requestBody).tag((Class<? super Class>) l8a.class, (Class) new l8a(b2gVar.a, this.b, b2gVar.b, arrayList)).build());
            if (newCall != null) {
                return newCall;
            }
            dmk.s("Call.Factory returned null.");
            return null;
        }
        dmk.v(ix2.i(xlnVarArr.length, ")", ace.o(length, "Argument count (", ") doesn't match expected count (")));
        return null;
    }

    public final Call b() {
        Call call = this.g;
        if (call != null) {
            return call;
        }
        Throwable th = this.h;
        if (th != null) {
            if (!(th instanceof IOException)) {
                if (th instanceof RuntimeException) {
                    throw ((RuntimeException) th);
                }
                throw ((Error) th);
            }
            throw ((IOException) th);
        }
        try {
            Call a = a();
            this.g = a;
            return a;
        } catch (IOException | Error | RuntimeException e) {
            h3n.q(e);
            this.h = e;
            throw e;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.Object, kq1, jq1] */
    public final y4g c(Response response) {
        ResponseBody body = response.body();
        Response build = response.newBuilder().body(new bhd(body.get$contentType(), body.get$contentLength())).build();
        int code = build.code();
        if (code >= 200 && code < 300) {
            if (code != 204 && code != 205) {
                ahd ahdVar = new ahd(body);
                try {
                    return y4g.b(this.e.Z(ahdVar), build);
                } catch (RuntimeException e) {
                    IOException iOException = ahdVar.c;
                    if (iOException == null) {
                        throw e;
                    }
                    throw iOException;
                }
            }
            body.close();
            return y4g.b(null, build);
        }
        try {
            ?? obj = new Object();
            body.get$this_asResponseBody().F0(obj);
            ResponseBody create = ResponseBody.create(body.get$contentType(), body.get$contentLength(), (kq1) obj);
            Objects.requireNonNull(create, "body == null");
            if (!build.getIsSuccessful()) {
                return new y4g(build, null, create);
            }
            throw new IllegalArgumentException("rawResponse should not be successful response");
        } finally {
            body.close();
        }
    }

    @Override // defpackage.bv2
    public final void cancel() {
        Call call;
        this.f = true;
        synchronized (this) {
            call = this.g;
        }
        if (call != null) {
            call.cancel();
        }
    }

    @Override // defpackage.bv2
    public final bv2 clone() {
        return new chd(this.a, this.b, this.c, this.d, this.e);
    }

    @Override // defpackage.bv2
    public final void enqueue(uv2 uv2Var) {
        Call call;
        Throwable th;
        Objects.requireNonNull(uv2Var, "callback == null");
        synchronized (this) {
            try {
                if (!this.i) {
                    this.i = true;
                    call = this.g;
                    th = this.h;
                    if (call == null && th == null) {
                        try {
                            Call a = a();
                            this.g = a;
                            call = a;
                        } catch (Throwable th2) {
                            th = th2;
                            h3n.q(th);
                            this.h = th;
                        }
                    }
                } else {
                    throw new IllegalStateException("Already executed.");
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        if (th != null) {
            uv2Var.onFailure(this, th);
            return;
        }
        if (this.f) {
            call.cancel();
        }
        call.enqueue(new n19(this, uv2Var, false, 25));
    }

    @Override // defpackage.bv2
    public final boolean isCanceled() {
        boolean z = true;
        if (this.f) {
            return true;
        }
        synchronized (this) {
            try {
                Call call = this.g;
                if (call == null || !call.isCanceled()) {
                    z = false;
                }
            } finally {
            }
        }
        return z;
    }

    @Override // defpackage.bv2
    public final synchronized boolean isExecuted() {
        return this.i;
    }

    @Override // defpackage.bv2
    public final synchronized Request request() {
        try {
        } catch (IOException e) {
            throw new RuntimeException("Unable to create request.", e);
        }
        return b().request();
    }

    @Override // defpackage.bv2
    public final synchronized b3j timeout() {
        try {
        } catch (IOException e) {
            throw new RuntimeException("Unable to create call.", e);
        }
        return b().timeout();
    }

    /* renamed from: clone, reason: collision with other method in class */
    public final Object m12clone() {
        return new chd(this.a, this.b, this.c, this.d, this.e);
    }
}
