/*
 * Copyright 2010-2024 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.kapt.cli.test;

import com.intellij.testFramework.TestDataPath;
import org.jetbrains.kotlin.test.util.KtTestUtil;
import org.jetbrains.kotlin.test.TestMetadata;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.util.regex.Pattern;

/** This class is generated by {@link org.jetbrains.kotlin.generators.tests.GenerateTestsKt}. DO NOT MODIFY MANUALLY */
@SuppressWarnings("all")
@TestMetadata("plugins/kapt3/kapt3-cli/testData/integration-kapt4")
@TestDataPath("$PROJECT_ROOT")
public class Kapt4ToolIntegrationTestGenerated extends AbstractKapt4ToolIntegrationTest {
  @Test
  public void testAllFilesPresentInIntegration_kapt4() {
    KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("plugins/kapt3/kapt3-cli/testData/integration-kapt4"), Pattern.compile("^([^\\.]+)$"), null, false);
  }

  @Test
  @TestMetadata("argfile")
  public void testArgfile() {
    runTest("plugins/kapt3/kapt3-cli/testData/integration-kapt4/argfile/");
  }

  @Test
  @TestMetadata("compileModeUnsupported")
  public void testCompileModeUnsupported() {
    runTest("plugins/kapt3/kapt3-cli/testData/integration-kapt4/compileModeUnsupported/");
  }

  @Test
  @TestMetadata("correctErrorTypesOn")
  public void testCorrectErrorTypesOn() {
    runTest("plugins/kapt3/kapt3-cli/testData/integration-kapt4/correctErrorTypesOn/");
  }

  @Test
  @TestMetadata("defaultMethods")
  public void testDefaultMethods() {
    runTest("plugins/kapt3/kapt3-cli/testData/integration-kapt4/defaultMethods/");
  }

  @Test
  @TestMetadata("defaultMethodsAllCompatibilityNoWarning")
  public void testDefaultMethodsAllCompatibilityNoWarning() {
    runTest("plugins/kapt3/kapt3-cli/testData/integration-kapt4/defaultMethodsAllCompatibilityNoWarning/");
  }

  @Test
  @TestMetadata("defaultMethodsAllNoWarning")
  public void testDefaultMethodsAllNoWarning() {
    runTest("plugins/kapt3/kapt3-cli/testData/integration-kapt4/defaultMethodsAllNoWarning/");
  }

  @Test
  @TestMetadata("defaultPackage")
  public void testDefaultPackage() {
    runTest("plugins/kapt3/kapt3-cli/testData/integration-kapt4/defaultPackage/");
  }

  @Test
  @TestMetadata("kaptUseK2Flag")
  public void testKaptUseK2Flag() {
    runTest("plugins/kapt3/kapt3-cli/testData/integration-kapt4/kaptUseK2Flag/");
  }

  @Test
  @TestMetadata("kotlinFileGeneration")
  public void testKotlinFileGeneration() {
    runTest("plugins/kapt3/kapt3-cli/testData/integration-kapt4/kotlinFileGeneration/");
  }

  @Test
  @TestMetadata("kotlinFileGenerationDefaultOutput")
  public void testKotlinFileGenerationDefaultOutput() {
    runTest("plugins/kapt3/kapt3-cli/testData/integration-kapt4/kotlinFileGenerationDefaultOutput/");
  }

  @Test
  @TestMetadata("kt33800")
  public void testKt33800() {
    runTest("plugins/kapt3/kapt3-cli/testData/integration-kapt4/kt33800/");
  }

  @Test
  @TestMetadata("multipass")
  public void testMultipass() {
    runTest("plugins/kapt3/kapt3-cli/testData/integration-kapt4/multipass/");
  }

  @Test
  @TestMetadata("separateStubAptCompilation")
  public void testSeparateStubAptCompilation() {
    runTest("plugins/kapt3/kapt3-cli/testData/integration-kapt4/separateStubAptCompilation/");
  }

  @Test
  @TestMetadata("simple")
  public void testSimple() {
    runTest("plugins/kapt3/kapt3-cli/testData/integration-kapt4/simple/");
  }

  @Test
  @TestMetadata("withoutService")
  public void testWithoutService() {
    runTest("plugins/kapt3/kapt3-cli/testData/integration-kapt4/withoutService/");
  }
}
