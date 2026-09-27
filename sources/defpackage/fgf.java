package defpackage;

import com.google.mlkit.common.MlKitException;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class fgf {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ fgf[] $VALUES;
    public static final fgf DataDecryptionFailure;
    public static final fgf InvalidDataElementFormat;
    public static final fgf InvalidMessageReceived;
    public static final fgf InvalidTransactionId;
    public static final fgf RequiredDataElementMissing;
    public static final fgf TransactionTimedout;
    public static final fgf UnrecognizedCriticalMessageExtensions;
    public static final fgf UnsupportedMessageVersion;
    private final int code;
    private final String description;

    static {
        fgf fgfVar = new fgf(0, 101, "InvalidMessageReceived", "Message is not AReq, ARes, CReq, CRes, PReq, PRes, RReq, or RRes");
        InvalidMessageReceived = fgfVar;
        fgf fgfVar2 = new fgf(1, 102, "UnsupportedMessageVersion", "Message Version Number received is not valid for the receiving component.");
        UnsupportedMessageVersion = fgfVar2;
        fgf fgfVar3 = new fgf(2, MlKitException.CODE_SCANNER_CANCELLED, "RequiredDataElementMissing", "A message element required as defined in Table A.1 is missing from the message.");
        RequiredDataElementMissing = fgfVar3;
        fgf fgfVar4 = new fgf(3, MlKitException.CODE_SCANNER_CAMERA_PERMISSION_NOT_GRANTED, "UnrecognizedCriticalMessageExtensions", "Critical message extension not recognised.");
        UnrecognizedCriticalMessageExtensions = fgfVar4;
        fgf fgfVar5 = new fgf(4, MlKitException.CODE_SCANNER_APP_NAME_UNAVAILABLE, "InvalidDataElementFormat", "Data element not in the required format or value is invalid as defined in Table A.1");
        InvalidDataElementFormat = fgfVar5;
        fgf fgfVar6 = new fgf(5, MlKitException.LOW_LIGHT_IMAGE_CAPTURE_PROCESSING_FAILURE, "InvalidTransactionId", "Transaction ID received is not valid for the receiving component.");
        InvalidTransactionId = fgfVar6;
        fgf fgfVar7 = new fgf(6, 302, "DataDecryptionFailure", "Data could not be decrypted by the receiving system due to technical or other reason.");
        DataDecryptionFailure = fgfVar7;
        fgf fgfVar8 = new fgf(7, 402, "TransactionTimedout", "Transaction timed-out.");
        TransactionTimedout = fgfVar8;
        fgf[] fgfVarArr = {fgfVar, fgfVar2, fgfVar3, fgfVar4, fgfVar5, fgfVar6, fgfVar7, fgfVar8};
        $VALUES = fgfVarArr;
        $ENTRIES = new wg7(fgfVarArr);
    }

    public fgf(int i, int i2, String str, String str2) {
        this.code = i2;
        this.description = str2;
    }

    public static fgf valueOf(String str) {
        return (fgf) Enum.valueOf(fgf.class, str);
    }

    public static fgf[] values() {
        return (fgf[]) $VALUES.clone();
    }

    public final int a() {
        return this.code;
    }

    public final String b() {
        return this.description;
    }
}
