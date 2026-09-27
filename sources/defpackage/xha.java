package defpackage;

import java.io.Closeable;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class xha extends wz7 {
    public final /* synthetic */ int d = 0;
    public final Closeable e;

    public xha(FileChannel fileChannel) {
        fileChannel.getClass();
        this.e = fileChannel;
    }

    @Override // defpackage.wz7
    public final synchronized void e() {
        int i = this.d;
        synchronized (this) {
            switch (i) {
                case 0:
                    ((RandomAccessFile) this.e).close();
                    return;
                default:
                    ((FileChannel) this.e).close();
                    return;
            }
        }
    }

    @Override // defpackage.wz7
    public final synchronized int g(long j, byte[] bArr, int i, int i2) {
        int i3 = this.d;
        int i4 = 0;
        synchronized (this) {
            switch (i3) {
                case 0:
                    bArr.getClass();
                    ((RandomAccessFile) this.e).seek(j);
                    while (true) {
                        if (i4 < i2) {
                            int read = ((RandomAccessFile) this.e).read(bArr, i, i2 - i4);
                            if (read == -1) {
                                if (i4 == 0) {
                                    return -1;
                                }
                            } else {
                                i4 += read;
                            }
                        }
                    }
                    return i4;
                default:
                    bArr.getClass();
                    ((FileChannel) this.e).position(j);
                    ByteBuffer wrap = ByteBuffer.wrap(bArr, i, i2);
                    while (true) {
                        if (i4 < i2) {
                            int read2 = ((FileChannel) this.e).read(wrap);
                            if (read2 == -1) {
                                if (i4 == 0) {
                                    return -1;
                                }
                            } else {
                                i4 += read2;
                            }
                        }
                    }
                    return i4;
            }
        }
    }

    @Override // defpackage.wz7
    public final synchronized long o() {
        int i = this.d;
        synchronized (this) {
            switch (i) {
                case 0:
                    return ((RandomAccessFile) this.e).length();
                default:
                    return ((FileChannel) this.e).size();
            }
        }
    }

    public xha(RandomAccessFile randomAccessFile) {
        this.e = randomAccessFile;
    }
}
