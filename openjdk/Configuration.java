/*
  Copyright (C) 2007 Jeroen Frijters

  This software is provided 'as-is', without any express or implied
  warranty.  In no event will the authors be held liable for any damages
  arising from the use of this software.

  Permission is granted to anyone to use this software for any purpose,
  including commercial applications, and to alter it and redistribute it
  freely, subject to the following restrictions:

  1. The origin of this software must not be misrepresented; you must not
     claim that you wrote the original software. If you use this software
     in a product, an acknowledgment in the product documentation would be
     appreciated but is not required.
  2. Altered source versions must be plainly marked as such, and must not be
     misrepresented as being the original software.
  3. This notice may not be removed or altered from any source distribution.

  Jeroen Frijters
  jeroen@frijters.net
  
*/
package gnu.classpath;

/*
 * This is a temporary class while we're using the GNU Classpath AWT/Swing implementation.
 */
public interface Configuration
{
    String default_awt_peer_toolkit = "ikvm.awt.NetToolkit, IKVM.AWT.WinForms, Version=0.36.0.14, Culture=neutral, PublicKeyToken=13235d27fcbfff58";
}