package defpackage;

import android.content.Context;
import android.content.res.AssetManager;
import android.net.Uri;
import io.ably.lib.util.AgentHeaderCreator;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class hm0 extends n81 {
    public final AssetManager e;
    public Uri f;
    public InputStream g;
    public long h;
    public boolean i;

    public hm0(Context context) {
        super(false);
        this.e = context.getAssets();
    }

    @Override // defpackage.gp5
    public final long a(jp5 jp5Var) {
        int i;
        try {
            Uri uri = jp5Var.a;
            long j = jp5Var.e;
            this.f = uri;
            String path = uri.getPath();
            path.getClass();
            if (path.startsWith("/android_asset/")) {
                path = path.substring(15);
            } else if (path.startsWith(AgentHeaderCreator.AGENT_DIVIDER)) {
                path = path.substring(1);
            }
            p();
            InputStream open = this.e.open(path, 1);
            this.g = open;
            if (open.skip(j) >= j) {
                long j2 = jp5Var.f;
                if (j2 != -1) {
                    this.h = j2;
                } else {
                    long available = this.g.available();
                    this.h = available;
                    if (available == 2147483647L) {
                        this.h = -1L;
                    }
                }
                this.i = true;
                q(jp5Var);
                return this.h;
            }
            throw new hp5(null, 2008);
        } catch (gm0 e) {
            throw e;
        } catch (IOException e2) {
            if (e2 instanceof FileNotFoundException) {
                i = 2005;
            } else {
                i = 2000;
            }
            throw new hp5(e2, i);
        }
    }

    @Override // defpackage.gp5
    public final void close() {
        this.f = null;
        try {
            try {
                InputStream inputStream = this.g;
                if (inputStream != null) {
                    inputStream.close();
                }
            } catch (IOException e) {
                throw new hp5(e, 2000);
            }
        } finally {
            this.g = null;
            if (this.i) {
                this.i = false;
                m();
            }
        }
    }

    @Override // defpackage.gp5
    public final Uri getUri() {
        return this.f;
    }

    @Override // defpackage.vo5
    public final int read(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        long j = this.h;
        if (j != 0) {
            if (j != -1) {
                try {
                    i2 = (int) Math.min(j, i2);
                } catch (IOException e) {
                    throw new hp5(e, 2000);
                }
            }
            InputStream inputStream = this.g;
            int i3 = u1k.a;
            int read = inputStream.read(bArr, i, i2);
            if (read != -1) {
                long j2 = this.h;
                if (j2 != -1) {
                    this.h = j2 - read;
                }
                i(read);
                return read;
            }
        }
        return -1;
    }
}
