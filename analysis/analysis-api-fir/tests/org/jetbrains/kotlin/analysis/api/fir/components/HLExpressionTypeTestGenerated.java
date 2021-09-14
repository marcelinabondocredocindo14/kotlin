/*
 * Copyright 2010-2021 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.analysis.api.fir.components;

import com.intellij.testFramework.TestDataPath;
import org.jetbrains.kotlin.test.util.KtTestUtil;
import org.jetbrains.kotlin.test.TestMetadata;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.util.regex.Pattern;

/** This class is generated by {@link GenerateNewCompilerTests.kt}. DO NOT MODIFY MANUALLY */
@SuppressWarnings("all")
@TestMetadata("analysis/analysis-api/testData/components/expressionType")
@TestDataPath("$PROJECT_ROOT")
public class HLExpressionTypeTestGenerated extends AbstractHLExpressionTypeTest {
    @Test
    public void testAllFilesPresentInExpressionType() throws Exception {
        KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("analysis/analysis-api/testData/components/expressionType"), Pattern.compile("^(.+)\\.kt$"), null, true);
    }

    @Test
    @TestMetadata("assignmentExpressionTarget.kt")
    public void testAssignmentExpressionTarget() throws Exception {
        runTest("analysis/analysis-api/testData/components/expressionType/assignmentExpressionTarget.kt");
    }

    @Test
    @TestMetadata("binaryExpression.kt")
    public void testBinaryExpression() throws Exception {
        runTest("analysis/analysis-api/testData/components/expressionType/binaryExpression.kt");
    }

    @Test
    @TestMetadata("breakExpression.kt")
    public void testBreakExpression() throws Exception {
        runTest("analysis/analysis-api/testData/components/expressionType/breakExpression.kt");
    }

    @Test
    @TestMetadata("forExpression.kt")
    public void testForExpression() throws Exception {
        runTest("analysis/analysis-api/testData/components/expressionType/forExpression.kt");
    }

    @Test
    @TestMetadata("functionCall.kt")
    public void testFunctionCall() throws Exception {
        runTest("analysis/analysis-api/testData/components/expressionType/functionCall.kt");
    }

    @Test
    @TestMetadata("inParens.kt")
    public void testInParens() throws Exception {
        runTest("analysis/analysis-api/testData/components/expressionType/inParens.kt");
    }

    @Test
    @TestMetadata("insideStringTemplate.kt")
    public void testInsideStringTemplate() throws Exception {
        runTest("analysis/analysis-api/testData/components/expressionType/insideStringTemplate.kt");
    }

    @Test
    @TestMetadata("insideStringTemplateWithBinrary.kt")
    public void testInsideStringTemplateWithBinrary() throws Exception {
        runTest("analysis/analysis-api/testData/components/expressionType/insideStringTemplateWithBinrary.kt");
    }

    @Test
    @TestMetadata("intLiteral.kt")
    public void testIntLiteral() throws Exception {
        runTest("analysis/analysis-api/testData/components/expressionType/intLiteral.kt");
    }

    @Test
    @TestMetadata("nonExpression.kt")
    public void testNonExpression() throws Exception {
        runTest("analysis/analysis-api/testData/components/expressionType/nonExpression.kt");
    }

    @Test
    @TestMetadata("property.kt")
    public void testProperty() throws Exception {
        runTest("analysis/analysis-api/testData/components/expressionType/property.kt");
    }

    @Test
    @TestMetadata("returnExpression.kt")
    public void testReturnExpression() throws Exception {
        runTest("analysis/analysis-api/testData/components/expressionType/returnExpression.kt");
    }

    @Test
    @TestMetadata("stringLiteral.kt")
    public void testStringLiteral() throws Exception {
        runTest("analysis/analysis-api/testData/components/expressionType/stringLiteral.kt");
    }

    @Test
    @TestMetadata("whileExpression.kt")
    public void testWhileExpression() throws Exception {
        runTest("analysis/analysis-api/testData/components/expressionType/whileExpression.kt");
    }
}
