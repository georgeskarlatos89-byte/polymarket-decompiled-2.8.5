package com.google.mlkit.common.sdkinternal.model;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import com.google.android.gms.internal.mlkit_common.zzi;
import com.google.mlkit.common.MlKitException;
import com.google.mlkit.common.model.LocalModel;
import defpackage.arn;
import defpackage.sv6;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public class LocalModelLoader {
    private MappedByteBuffer zza;
    private final Context zzb;
    private final LocalModel zzc;

    public LocalModelLoader(Context context, LocalModel localModel) {
        this.zzb = context;
        this.zzc = localModel;
    }

    public LocalModel getLocalModel() {
        return this.zzc;
    }

    public MappedByteBuffer load() {
        FileChannel channel;
        arn.i(this.zzb, "Context can not be null");
        arn.i(this.zzc, "Model source can not be null");
        MappedByteBuffer mappedByteBuffer = this.zza;
        if (mappedByteBuffer != null) {
            return mappedByteBuffer;
        }
        LocalModel localModel = this.zzc;
        String absoluteFilePath = localModel.getAbsoluteFilePath();
        String assetFilePath = localModel.getAssetFilePath();
        Uri uri = localModel.getUri();
        if (absoluteFilePath != null) {
            try {
                RandomAccessFile randomAccessFile = new RandomAccessFile(absoluteFilePath, "r");
                try {
                    FileChannel channel2 = randomAccessFile.getChannel();
                    try {
                        this.zza = channel2.map(FileChannel.MapMode.READ_ONLY, 0L, channel2.size());
                        channel2.close();
                        randomAccessFile.close();
                    } finally {
                    }
                } finally {
                }
            } catch (IOException e) {
                throw new MlKitException("Can not open the local file: ".concat(String.valueOf(this.zzc.getAbsoluteFilePath())), 14, e);
            }
        } else if (assetFilePath != null) {
            try {
                AssetFileDescriptor openFd = this.zzb.getAssets().openFd(assetFilePath);
                try {
                    channel = new FileInputStream(openFd.getFileDescriptor()).getChannel();
                    try {
                        this.zza = channel.map(FileChannel.MapMode.READ_ONLY, openFd.getStartOffset(), openFd.getDeclaredLength());
                        channel.close();
                        openFd.close();
                    } finally {
                        if (channel != null) {
                            try {
                                channel.close();
                                throw th;
                            } catch (Throwable th) {
                                th.addSuppressed(th);
                            }
                        }
                        throw th;
                    }
                } finally {
                }
            } catch (IOException e2) {
                throw new MlKitException(sv6.n("Can not load the file from asset: ", assetFilePath, ". Please double check your asset file name and ensure it's not compressed. See documentation for details how to use aaptOptions to skip file compression"), 14, e2);
            }
        } else if (uri != null) {
            try {
                AssetFileDescriptor zza = zzi.zza(this.zzb, uri, "r");
                try {
                    channel = zza.createInputStream().getChannel();
                    try {
                        this.zza = channel.map(FileChannel.MapMode.READ_ONLY, zza.getStartOffset(), zza.getLength());
                        channel.close();
                        zza.close();
                    } finally {
                    }
                } finally {
                }
            } catch (IOException e3) {
                throw new MlKitException("Can not load the file from URI: ".concat(uri.toString()), 14, e3);
            }
        } else {
            throw new MlKitException("Can not load the model. One of filePath, assetFilePath or URI must be set for the model.", 14);
        }
        return this.zza;
    }
}
