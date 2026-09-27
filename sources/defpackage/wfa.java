package defpackage;

import io.sentry.android.core.m0;
import java.io.UnsupportedEncodingException;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public abstract class wfa extends m1g {
    protected static final String PROTOCOL_CHARSET = "utf-8";
    private static final String PROTOCOL_CONTENT_TYPE = "application/json; charset=utf-8";
    private x4g mListener;
    private final Object mLock;
    private final String mRequestBody;

    public wfa(String str, String str2, x4g x4gVar, w4g w4gVar) {
        super(str, w4gVar);
        this.mLock = new Object();
        this.mListener = x4gVar;
        this.mRequestBody = str2;
    }

    @Override // defpackage.m1g
    public void cancel() {
        super.cancel();
        synchronized (this.mLock) {
            this.mListener = null;
        }
    }

    @Override // defpackage.m1g
    public void deliverResponse(Object obj) {
        x4g x4gVar;
        synchronized (this.mLock) {
            x4gVar = this.mListener;
        }
        if (x4gVar != null) {
            x4gVar.onResponse(obj);
        }
    }

    @Override // defpackage.m1g
    public byte[] getBody() {
        try {
            String str = this.mRequestBody;
            if (str == null) {
                return null;
            }
            return str.getBytes(PROTOCOL_CHARSET);
        } catch (UnsupportedEncodingException unused) {
            m0.s("Volley", fdk.a("Unsupported Encoding while trying to get the bytes of %s using %s", this.mRequestBody, PROTOCOL_CHARSET));
            return null;
        }
    }

    @Override // defpackage.m1g
    public String getBodyContentType() {
        return PROTOCOL_CONTENT_TYPE;
    }

    @Override // defpackage.m1g
    @Deprecated
    public byte[] getPostBody() {
        return getBody();
    }

    @Override // defpackage.m1g
    @Deprecated
    public String getPostBodyContentType() {
        return getBodyContentType();
    }
}
