package defpackage;

import com.appsflyer.internal.l;
import com.google.mlkit.vision.barcode.common.Barcode;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class w2k {
    public static final asb q = csb.b(w2k.class);
    public ByteBuffer a;
    public byte d;
    public vt1 f;
    public q2k g;
    public w2k i;
    public int j;
    public long m;
    public int n;
    public boolean o;
    public ByteBuffer b = ByteBuffer.allocate(0);
    public final at7 c = new at7(Barcode.FORMAT_UPC_A, 1);
    public final ByteArrayOutputStream h = new ByteArrayOutputStream(Barcode.FORMAT_UPC_E);
    public final long k = 67108864;
    public final int l = 67108864;
    public boolean p = true;
    public final t2k e = new t2k(this);

    public w2k() {
        f();
    }

    public final void a(ByteBuffer byteBuffer, ByteArrayOutputStream byteArrayOutputStream) {
        t2k t2kVar = this.e;
        if (this.o) {
            ByteBuffer allocate = ByteBuffer.allocate(byteBuffer.remaining() + this.b.remaining());
            allocate.put(this.b);
            allocate.put(byteBuffer);
            allocate.flip();
            this.b = allocate.duplicate();
            try {
                int e = e(allocate);
                if (e == 0) {
                    e = d(allocate);
                }
                at7 at7Var = this.c;
                if (e == 0) {
                    while (allocate.hasRemaining() && t2kVar.a(allocate) == 0 && !c()) {
                        if (!this.p) {
                            byteArrayOutputStream.write(at7Var.g(), this.n, at7Var.size() - this.n);
                            at7Var.reset();
                            t2kVar.j = 0;
                            this.n = 0;
                        }
                    }
                }
                this.b = allocate;
                ByteBuffer o = at7Var.o();
                o.position(this.n);
                while (o.hasRemaining()) {
                    byteArrayOutputStream.write(o.get());
                }
                this.n = o.limit();
                return;
            } catch (IOException e2) {
                f();
                throw e2;
            }
        }
        f();
        dmk.x("decodeChunk() called without startDecoding()");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0038 A[Catch: all -> 0x0040, TRY_ENTER, TryCatch #0 {all -> 0x0040, blocks: (B:2:0x0000, B:4:0x0004, B:8:0x000f, B:9:0x0015, B:14:0x0038, B:15:0x003f, B:16:0x0017, B:19:0x001d, B:22:0x0024, B:25:0x002b, B:27:0x0042, B:28:0x0049), top: B:1:0x0000 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b() {
        boolean z;
        boolean hasRemaining;
        try {
            if (this.o) {
                boolean z2 = true;
                if (this.f != null) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z) {
                    hasRemaining = this.b.hasRemaining();
                } else {
                    if (this.i == null && !this.e.b) {
                        if (!c()) {
                            hasRemaining = this.b.hasRemaining();
                        } else {
                            if (z2) {
                                f();
                                return;
                            }
                            throw new IOException("finishDecoding() called before parsing entire delta file window");
                        }
                    }
                    z2 = false;
                    if (z2) {
                    }
                }
                z2 = true ^ hasRemaining;
                if (z2) {
                }
            } else {
                throw new IOException("finishDecoding() called before startDecoding(), or called after decodeChunk() returned false");
            }
        } catch (Throwable th) {
            f();
            throw th;
        }
    }

    public final boolean c() {
        int i = this.j;
        if (i == -3) {
            return false;
        }
        long j = this.m;
        long j2 = i;
        if (j <= j2) {
            if (j != j2) {
                return false;
            }
            return true;
        }
        throw new IllegalStateException(String.format("Internal error: Decoded data size %d exceeds planned target file size %d", Long.valueOf(j), Integer.valueOf(this.j)));
    }

    public final int d(ByteBuffer byteBuffer) {
        ByteArrayOutputStream byteArrayOutputStream = this.h;
        w2k w2kVar = this.i;
        if (w2kVar == null) {
            return 0;
        }
        if (this.g != null) {
            try {
                w2kVar.a(ByteBuffer.wrap(byteBuffer.array(), byteBuffer.arrayOffset() + byteBuffer.position(), byteBuffer.remaining()), byteArrayOutputStream);
                int size = byteArrayOutputStream.size();
                int i = q2k.j;
                if (size < i) {
                    byteBuffer.position(byteBuffer.limit());
                    return -2;
                }
                this.i.b();
                if (byteArrayOutputStream.size() == i) {
                    this.g = new q2k(byteArrayOutputStream.toByteArray());
                    byteArrayOutputStream.reset();
                    byteBuffer.position(byteBuffer.limit() - this.i.b.remaining());
                    this.i = null;
                    q2k q2kVar = this.g;
                    short b = this.f.b();
                    t2k t2kVar = this.e;
                    t2kVar.getClass();
                    t2kVar.n = new r2k(q2kVar, b);
                    return 0;
                }
                l.l("Decoded custom code table size (%d) does not match size of a code table (%d)", new Object[]{Integer.valueOf(byteArrayOutputStream.size()), Integer.valueOf(i)});
                return 0;
            } catch (IOException e) {
                IOException iOException = new IOException("Failed to write to custom_code_table_string_");
                iOException.initCause(e);
                throw iOException;
            }
        }
        dmk.n("Internal error: custom_code_table_decoder_ is set, but custom_code_table_ is null");
        return 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0060  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int e(ByteBuffer byteBuffer) {
        boolean z;
        int position;
        boolean z2;
        if (this.f != null) {
            return 0;
        }
        int remaining = byteBuffer.remaining();
        ByteBuffer allocate = ByteBuffer.allocate(5);
        allocate.put((ByteBuffer) byteBuffer.slice().limit(Math.min(5, byteBuffer.remaining())));
        allocate.rewind();
        byte b = allocate.get();
        byte b2 = allocate.get();
        byte b3 = allocate.get();
        byte b4 = allocate.get();
        byte b5 = allocate.get();
        if (remaining != 0) {
            z = true;
            if (remaining != 1) {
                if (remaining != 2) {
                    if (remaining != 3) {
                        this.d = b4;
                        if (b4 != 0 && b4 != 83) {
                            dmk.x("Unrecognized VCDIFF format version");
                            return 0;
                        }
                    }
                    if (b3 != -60) {
                        z2 = true;
                        if (b2 != -61) {
                            z2 = true;
                        }
                    }
                }
                z2 = false;
                if (b2 != -61) {
                }
            } else {
                z2 = false;
            }
            if (b == -42) {
                z = z2;
            }
        } else {
            z = false;
        }
        if (!z) {
            if (remaining >= 5) {
                int i = b5 & 252;
                if (i == 0) {
                    if ((b5 & 1) == 0) {
                        if ((b5 & 2) != 0) {
                            v2k v2kVar = new v2k(ByteBuffer.wrap(byteBuffer.array(), byteBuffer.position() + byteBuffer.arrayOffset() + 5, byteBuffer.remaining() - 5).slice());
                            Integer b6 = v2kVar.b("size of near cache");
                            asb asbVar = q;
                            if (b6 == null) {
                                asbVar.a("Failed to parse size of near cache");
                                position = v2kVar.a;
                            } else {
                                Integer b7 = v2kVar.b("size of same cache");
                                if (b7 == null) {
                                    asbVar.a("Failed to parse size of same cache");
                                    position = v2kVar.a;
                                } else {
                                    this.g = new q2k();
                                    this.h.reset();
                                    this.f = new vt1(b6.shortValue(), b7.shortValue());
                                    this.i = new w2k();
                                    byte[] b8 = q2k.i.b();
                                    w2k w2kVar = this.i;
                                    w2kVar.getClass();
                                    w2kVar.g(ByteBuffer.wrap(b8));
                                    this.i.j = b8.length;
                                    position = v2kVar.d.duplicate().asReadOnlyBuffer().position();
                                }
                            }
                            if (position != -2) {
                                byteBuffer.position(byteBuffer.position() + 5 + position);
                                return 0;
                            }
                        } else {
                            this.f = new vt1((short) 4, (short) 3);
                            byteBuffer.position(byteBuffer.position() + 5);
                            return 0;
                        }
                    } else {
                        dmk.x("Secondary compression is not supported");
                        return 0;
                    }
                } else {
                    l.l("Unrecognized hdr_indicator flags: %02x", new Object[]{Integer.valueOf(i)});
                    return 0;
                }
            }
            return -2;
        }
        dmk.x("Did not find VCDIFF header bytes; input is not a VCDIFF delta file");
        return 0;
    }

    public final void f() {
        this.o = false;
        this.a = null;
        this.d = (byte) 0;
        this.j = -3;
        this.m = 0L;
        this.f = null;
        this.g = null;
        this.i = null;
        this.e.b();
        this.n = 0;
    }

    public final void g(ByteBuffer byteBuffer) {
        if (!this.o) {
            this.b = ByteBuffer.allocate(0);
            this.c.reset();
            f();
            this.a = byteBuffer;
            this.o = true;
            return;
        }
        dmk.n("startDecoding() called twice without finishDecoding()");
    }
}
