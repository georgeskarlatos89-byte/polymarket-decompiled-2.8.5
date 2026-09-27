package defpackage;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.Bundle;
import com.socure.docv.capturesdk.common.utils.ApiConstant;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.channels.FileChannel;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class s35 extends n81 {
    public final ContentResolver e;
    public Uri f;
    public AssetFileDescriptor g;
    public FileInputStream h;
    public long i;
    public boolean j;

    public s35(Context context) {
        super(false);
        this.e = context.getContentResolver();
    }

    @Override // defpackage.gp5
    public final long a(jp5 jp5Var) {
        int i;
        int i2;
        AssetFileDescriptor openAssetFileDescriptor;
        long j;
        long min;
        try {
            try {
                Uri uri = jp5Var.a;
                long j2 = jp5Var.f;
                long j3 = jp5Var.e;
                Uri normalizeScheme = uri.normalizeScheme();
                this.f = normalizeScheme;
                p();
                boolean equals = "content".equals(normalizeScheme.getScheme());
                ContentResolver contentResolver = this.e;
                if (equals) {
                    Bundle bundle = new Bundle();
                    bundle.putBoolean("android.provider.extra.ACCEPT_ORIGINAL_MEDIA_FORMAT", true);
                    openAssetFileDescriptor = contentResolver.openTypedAssetFileDescriptor(normalizeScheme, ApiConstant.ALL_MEDIA_TYPE, bundle);
                } else {
                    openAssetFileDescriptor = contentResolver.openAssetFileDescriptor(normalizeScheme, "r");
                }
                this.g = openAssetFileDescriptor;
                if (openAssetFileDescriptor != null) {
                    long length = openAssetFileDescriptor.getLength();
                    FileInputStream fileInputStream = new FileInputStream(openAssetFileDescriptor.getFileDescriptor());
                    this.h = fileInputStream;
                    if (length != -1 && j3 > length) {
                        throw new hp5(null, 2008);
                    }
                    long startOffset = openAssetFileDescriptor.getStartOffset();
                    long skip2 = fileInputStream.skip(startOffset + j3) - startOffset;
                    if (skip2 == j3) {
                        if (length == -1) {
                            FileChannel channel = fileInputStream.getChannel();
                            long size = channel.size();
                            if (size == 0) {
                                this.i = -1L;
                                j = -1;
                            } else {
                                j = size - channel.position();
                                this.i = j;
                                if (j < 0) {
                                    throw new hp5(null, 2008);
                                }
                            }
                        } else {
                            j = length - skip2;
                            this.i = j;
                            if (j < 0) {
                                throw new hp5(null, 2008);
                            }
                        }
                        if (j2 != -1) {
                            if (j == -1) {
                                min = j2;
                            } else {
                                min = Math.min(j, j2);
                            }
                            this.i = min;
                        }
                        this.j = true;
                        q(jp5Var);
                        if (j2 != -1) {
                            return j2;
                        }
                        return this.i;
                    }
                    throw new hp5(null, 2008);
                }
                i = 2000;
                try {
                    throw new hp5(new IOException("Could not open file descriptor for: " + normalizeScheme), 2000);
                } catch (IOException e) {
                    e = e;
                    if (e instanceof FileNotFoundException) {
                        i2 = 2005;
                    } else {
                        i2 = i;
                    }
                    throw new hp5(e, i2);
                }
            } catch (r35 e2) {
                throw e2;
            }
        } catch (IOException e3) {
            e = e3;
            i = 2000;
        }
    }

    @Override // defpackage.gp5
    public final void close() {
        this.f = null;
        try {
            try {
                FileInputStream fileInputStream = this.h;
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
                this.h = null;
                try {
                    try {
                        AssetFileDescriptor assetFileDescriptor = this.g;
                        if (assetFileDescriptor != null) {
                            assetFileDescriptor.close();
                        }
                    } catch (IOException e) {
                        throw new hp5(e, 2000);
                    }
                } finally {
                    this.g = null;
                    if (this.j) {
                        this.j = false;
                        m();
                    }
                }
            } catch (IOException e2) {
                throw new hp5(e2, 2000);
            }
        } catch (Throwable th) {
            this.h = null;
            try {
                try {
                    AssetFileDescriptor assetFileDescriptor2 = this.g;
                    if (assetFileDescriptor2 != null) {
                        assetFileDescriptor2.close();
                    }
                    this.g = null;
                    if (this.j) {
                        this.j = false;
                        m();
                    }
                    throw th;
                } catch (IOException e3) {
                    throw new hp5(e3, 2000);
                }
            } finally {
                this.g = null;
                if (this.j) {
                    this.j = false;
                    m();
                }
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
        long j = this.i;
        if (j != 0) {
            if (j != -1) {
                try {
                    i2 = (int) Math.min(j, i2);
                } catch (IOException e) {
                    throw new hp5(e, 2000);
                }
            }
            FileInputStream fileInputStream = this.h;
            int i3 = u1k.a;
            int read = fileInputStream.read(bArr, i, i2);
            if (read != -1) {
                long j2 = this.i;
                if (j2 != -1) {
                    this.i = j2 - read;
                }
                i(read);
                return read;
            }
        }
        return -1;
    }
}
