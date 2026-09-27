package io.intercom.android.sdk.lightcompressor.utils;

import android.util.Log;
import io.intercom.android.sdk.lightcompressor.data.AtomsKt;
import io.intercom.android.sdk.metrics.ops.OpsMetricTracker;
import io.sentry.android.core.m0;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.channels.FileChannel;
import kotlin.Metadata;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\f\u001a\u00020\u000bJ\u0018\u0010\r\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002J\u0012\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0002J\u0018\u0010\u0015\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\u0017H\u0002J \u0010\u0015\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"Lio/intercom/android/sdk/lightcompressor/utils/StreamableVideo;", "", "<init>", "()V", "tag", "", "ATOM_PREAMBLE_SIZE", "", OpsMetricTracker.START, "", "in", "Ljava/io/File;", "out", "convert", "infile", "Ljava/nio/channels/FileChannel;", "outfile", "safeClose", "", "closeable", "Ljava/io/Closeable;", "readAndFill", "buffer", "Ljava/nio/ByteBuffer;", "position", "", "intercom-sdk-lightcompressor_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class StreamableVideo {
    private static final int ATOM_PREAMBLE_SIZE = 8;
    public static final StreamableVideo INSTANCE = new StreamableVideo();
    private static final String tag = "StreamableVideo";

    private StreamableVideo() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:103:0x00de A[EDGE_INSN: B:103:0x00de->B:31:0x00de BREAK  A[LOOP:0: B:2:0x0018->B:104:?], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:104:? A[LOOP:0: B:2:0x0018->B:104:?, LOOP_END, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final boolean convert(FileChannel infile, FileChannel outfile) {
        boolean z;
        long j;
        ByteBuffer order = ByteBuffer.allocate(8).order(ByteOrder.BIG_ENDIAN);
        long j2 = 0;
        ByteBuffer byteBuffer = null;
        int i = 0;
        long j3 = 0;
        while (true) {
            order.getClass();
            if (readAndFill(infile, order)) {
                j2 = NumbersUtilsKt.uInt32ToLong(order.getInt());
                i = order.getInt();
                if (i == AtomsKt.getFTYP_ATOM()) {
                    int uInt32ToInt = NumbersUtilsKt.uInt32ToInt(j2);
                    z = 0;
                    z = 0;
                    ByteBuffer order2 = ByteBuffer.allocate(uInt32ToInt).order(ByteOrder.BIG_ENDIAN);
                    order.rewind();
                    order2.put(order);
                    if (infile.read(order2) >= uInt32ToInt - 8) {
                        order2.flip();
                        j3 = infile.position();
                        byteBuffer = order2;
                        j = 8;
                        if (i == AtomsKt.getFREE_ATOM() && i != AtomsKt.getJUNK_ATOM() && i != AtomsKt.getMDAT_ATOM() && i != AtomsKt.getMOOV_ATOM() && i != AtomsKt.getPNOT_ATOM() && i != AtomsKt.getSKIP_ATOM() && i != AtomsKt.getWIDE_ATOM() && i != AtomsKt.getPICT_ATOM() && i != AtomsKt.getUUID_ATOM() && i != AtomsKt.getFTYP_ATOM()) {
                            m0.s(tag, "encountered non-QT top-level atom (is this a QuickTime file?)");
                            break;
                        }
                        if (j2 >= j) {
                            break;
                        }
                    } else {
                        byteBuffer = order2;
                        break;
                    }
                } else {
                    z = 0;
                    z = 0;
                    z = 0;
                    if (j2 == 1) {
                        order.clear();
                        if (!readAndFill(infile, order)) {
                            break;
                        }
                        j2 = NumbersUtilsKt.uInt64ToLong(order.getLong());
                        j = 8;
                        infile.position((infile.position() + j2) - 16);
                    } else {
                        j = 8;
                        infile.position((infile.position() + j2) - 8);
                    }
                    if (i == AtomsKt.getFREE_ATOM()) {
                    }
                    if (j2 >= j) {
                    }
                }
            } else {
                z = 0;
                break;
            }
        }
        if (i != AtomsKt.getMOOV_ATOM()) {
            m0.s(tag, "last atom in file was not a moov atom");
            return z;
        }
        int uInt32ToInt2 = NumbersUtilsKt.uInt32ToInt(j2);
        long j4 = uInt32ToInt2;
        long size = infile.size() - j4;
        ByteBuffer order3 = ByteBuffer.allocate(uInt32ToInt2).order(ByteOrder.BIG_ENDIAN);
        if (readAndFill(infile, order3, size)) {
            if (order3.getInt(12) != AtomsKt.getCMOV_ATOM()) {
                for (int i2 = 8; order3.remaining() >= i2; i2 = 8) {
                    int position = order3.position();
                    int i3 = order3.getInt(position + 4);
                    if (i3 != AtomsKt.getSTCO_ATOM() && i3 != AtomsKt.getCO64_ATOM()) {
                        order3.position(order3.position() + 1);
                    } else {
                        int i4 = uInt32ToInt2;
                        if (NumbersUtilsKt.uInt32ToLong(order3.getInt(position)) <= order3.remaining()) {
                            order3.position(position + 12);
                            if (order3.remaining() >= 4) {
                                int uInt32ToInt3 = NumbersUtilsKt.uInt32ToInt(order3.getInt());
                                if (i3 == AtomsKt.getSTCO_ATOM()) {
                                    Log.i(tag, "patching stco atom...");
                                    if (order3.remaining() >= uInt32ToInt3 * 4) {
                                        for (int i5 = z; i5 < uInt32ToInt3; i5++) {
                                            int i6 = order3.getInt(order3.position());
                                            int i7 = i6 + i4;
                                            if (i6 < 0 && i7 >= 0) {
                                                throw new Exception("This is bug in original qt-faststart.c: stco atom should be extended to co64 atom as new offset value overflows uint32, but is not implemented.");
                                            }
                                            order3.putInt(i7);
                                        }
                                    } else {
                                        throw new Exception("bad atom size/element count");
                                    }
                                } else if (i3 == AtomsKt.getCO64_ATOM()) {
                                    m0.s(tag, "patching co64 atom...");
                                    if (order3.remaining() >= uInt32ToInt3 * 8) {
                                        for (int i8 = z; i8 < uInt32ToInt3; i8++) {
                                            order3.putLong(order3.getLong(order3.position()) + j4);
                                        }
                                    } else {
                                        throw new Exception("bad atom size/element count");
                                    }
                                }
                                uInt32ToInt2 = i4;
                            } else {
                                throw new Exception("malformed atom");
                            }
                        } else {
                            throw new Exception("bad atom size");
                        }
                    }
                }
                infile.position(j3);
                if (byteBuffer != null) {
                    Log.i(tag, "writing ftyp atom...");
                    byteBuffer.rewind();
                    outfile.write(byteBuffer);
                }
                Log.i(tag, "writing moov atom...");
                order3.rewind();
                outfile.write(order3);
                Log.i(tag, "copying rest of file...");
                infile.transferTo(j3, size - j3, outfile);
                return true;
            }
            throw new Exception("this utility does not support compressed moov atoms yet");
        }
        throw new Exception("failed to read moov atom");
    }

    private final boolean readAndFill(FileChannel infile, ByteBuffer buffer) {
        buffer.clear();
        int read = infile.read(buffer);
        buffer.flip();
        if (read == buffer.capacity()) {
            return true;
        }
        return false;
    }

    private final void safeClose(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
                m0.s(tag, "Failed to close file: ");
            }
        }
    }

    public final boolean start(File in, File out) {
        FileOutputStream fileOutputStream;
        out.getClass();
        Closeable closeable = null;
        try {
            FileInputStream fileInputStream = new FileInputStream(in);
            try {
                FileChannel channel = fileInputStream.getChannel();
                fileOutputStream = new FileOutputStream(out);
                try {
                    FileChannel channel2 = fileOutputStream.getChannel();
                    channel.getClass();
                    channel2.getClass();
                    boolean convert = convert(channel, channel2);
                    safeClose(fileInputStream);
                    safeClose(fileOutputStream);
                    if (!convert) {
                        out.delete();
                    }
                    return convert;
                } catch (Throwable th) {
                    th = th;
                    closeable = fileInputStream;
                    safeClose(closeable);
                    safeClose(fileOutputStream);
                    out.delete();
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                fileOutputStream = null;
            }
        } catch (Throwable th3) {
            th = th3;
            fileOutputStream = null;
        }
    }

    private final boolean readAndFill(FileChannel infile, ByteBuffer buffer, long position) {
        buffer.clear();
        int read = infile.read(buffer, position);
        buffer.flip();
        return read == buffer.capacity();
    }
}
