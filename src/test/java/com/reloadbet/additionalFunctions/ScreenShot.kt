/*
package com.reloadbet.additionalFunctions

fun TestBase.screenShotComparison() {
    val screenShot = AShot().shootingStrategy(ShootingStrategies.viewportPasting(500)).takeScreenshot(driver)
    ImageIO.write(screenShot.image, "PNG", File("/tmp/Downloads/screenshot_1.png"))
    val s2 = AShot().shootingStrategy(ShootingStrategies.viewportPasting(500)).takeScreenshot(driver)
    val diff = ImageDiffer().makeDiff(screenShot, s2)
    val oo = diff.markedImage
    ImageIO.write(oo, "PNG", File("/tmp/Downloads/screenshot_2.png"))
}

fun TestBase.screenShotGetDisplay() {
    driver.getScreenshotAs(OutputType.FILE).copyTo(File("/tmp/Downloads/screenshot_${LocalDateTime.now()}.png"), overwrite = true)
}

fun TestBase.screenShotGetFullDisplay() {
    val screenShot = AShot().shootingStrategy(ShootingStrategies.viewportPasting(1_000)).takeScreenshot(driver)
    ImageIO.write(screenShot.image, "PNG", File("/tmp/Downloads/screenshot_${LocalDateTime.now()}.png"))
}
*/
//FIXME!
